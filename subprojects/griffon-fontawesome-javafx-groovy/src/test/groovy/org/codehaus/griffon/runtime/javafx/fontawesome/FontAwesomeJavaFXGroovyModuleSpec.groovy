/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.griffon.runtime.javafx.fontawesome

import griffon.builder.javafx.factory.FontAwesomeIconFactory
import griffon.core.GriffonApplication
import griffon.core.test.GriffonUnitRule
import griffon.plugins.fontawesome.FontAwesome
import griffon.javafx.support.fontawesome.FontAwesomeIcon
import griffon.util.BuilderCustomizer
import griffon.util.CompositeBuilder
import javafx.embed.swing.JFXPanel
import org.junit.Rule
import spock.lang.Specification
import spock.lang.Unroll

import javax.annotation.Nonnull
import javax.inject.Inject

import static griffon.util.AnnotationUtils.sortByDependencies

/**
 * @author Andres Almiray
 */
class FontAwesomeJavaFXGroovyModuleSpec extends Specification {
    static {
        new JFXPanel()
    }

    @Rule
    public final GriffonUnitRule griffon = new GriffonUnitRule()

    @Inject
    private GriffonApplication application

    def 'Builder customizer is configured correctly'() {
        when:
        FactoryBuilderSupport builder = createBuilder(application)

        then:
        builder.factories.containsKey('fontAwesomeIcon')
        builder.factories.fontAwesomeIcon.class == FontAwesomeIconFactory
    }

    @Unroll
    def 'Can create a FontAwesomeIcon using the factory'() {
        given:
        FactoryBuilderSupport builder = createBuilder(application)

        when:
        FontAwesomeIcon faIcon = builder.fontAwesomeIcon(value, icon: icon)

        then:
        faIcon.iconValue == expected

        where:
        value                 | icon                  || expected
        FontAwesome.FA_ADJUST | null                  || FontAwesome.FA_ADJUST
        null                  | FontAwesome.FA_ADJUST || FontAwesome.FA_ADJUST
        null                  | 'fa-adjust'           || FontAwesome.FA_ADJUST
    }

    @Unroll
    def 'Invalid values for creating a FontAwesomeIcon using the factory'() {
        given:
        FactoryBuilderSupport builder = createBuilder(application)

        when:
        builder.fontAwesomeIcon(value)

        then:
        RuntimeException e = thrown()
        e.cause instanceof IllegalArgumentException

        where:
        value        | _
        null         | _
        new Object() | _
    }

    private static final String BUILDER_CUSTOMIZER = 'BuilderCustomizer'

    @Nonnull
    protected FactoryBuilderSupport createBuilder(@Nonnull GriffonApplication application) {
        Collection<BuilderCustomizer> customizers = resolveBuilderCustomizers(application)
        return new CompositeBuilder(customizers.toArray(new BuilderCustomizer[customizers.size()]))
    }

    @Nonnull
    private Collection<BuilderCustomizer> resolveBuilderCustomizers(@Nonnull GriffonApplication application) {
        Collection<BuilderCustomizer> customizerInstances = application.injector.getInstances(BuilderCustomizer)
        return sortByDependencies(customizerInstances, BUILDER_CUSTOMIZER, 'customizer').values()
    }
}
