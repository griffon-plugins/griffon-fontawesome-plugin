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
package griffon.builder.swing.factory;

import griffon.plugins.fontawesome.FontAwesome;
import griffon.swing.support.fontawesome.FontAwesomeIcon;
import groovy.util.AbstractFactory;
import groovy.util.FactoryBuilderSupport;

import java.util.Map;

/**
 * @author Andres Almiray
 */
public class FontAwesomeIconFactory extends AbstractFactory {
    @Override
    public Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) throws InstantiationException, IllegalAccessException {
        Object iconName = attributes.remove("icon");
        if (iconName == null) {
            iconName = value;
        }

        if (iconName == null) {
            throw new IllegalArgumentException("In " + name + " you must define a node value or icon:");
        }
        if (iconName instanceof CharSequence) {
            return new FontAwesomeIcon(iconName.toString());
        } else if (iconName instanceof FontAwesome) {
            return new FontAwesomeIcon((FontAwesome) iconName);
        }

        throw new IllegalArgumentException(name + " cannot parse " + iconName + " as a fontawesome icon description.");
    }
}
