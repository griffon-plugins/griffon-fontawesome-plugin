/*
 * Copyright 2014 the original author or authors.
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
package griffon.builder.javafx.factory

import griffon.javafx.support.fontawesome.FontAwesomeIcon
import griffon.plugins.fontawesome.FontAwesome
import groovyx.javafx.factory.LabeledFactory

/**
 * @author Andres Almiray
 */
public class FontAwesomeIconFactory extends LabeledFactory {
    FontAwesomeIconFactory() {
        super(FontAwesomeIcon)
    }

    public Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) {
        def iconName = attributes.remove('icon') ?: value
        if (!iconName) {
            throw new IllegalArgumentException("In $name you must define a node value or icon:")
        }

        String iconSize = attributes.remove('size') ?: '16'

        if (iconName instanceof CharSequence) {
            FontAwesomeIcon icon = new FontAwesomeIcon(iconName.toString())
            icon.iconSize = iconSize.toInteger()
            return icon
        } else if (iconName instanceof FontAwesome) {
            FontAwesomeIcon icon = new FontAwesomeIcon((FontAwesome) iconName)
            icon.iconSize = iconSize.toInteger()
            return icon
        }

        throw new IllegalArgumentException("$name cannot parse $iconName as a fontawesome icon description.")
    }
}
