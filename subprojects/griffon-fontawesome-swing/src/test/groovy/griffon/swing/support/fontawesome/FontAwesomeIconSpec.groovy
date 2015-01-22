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
package griffon.swing.support.fontawesome

import griffon.plugins.fontawesome.FontAwesome
import spock.lang.Specification

/**
 * @author Andres Almiray
 */
class FontAwesomeIconSpec extends Specification {
    def 'Can create a FontAwesomeIcon instance'() {
        given:
        FontAwesome expected = FontAwesome.FA_GITHUB

        expect:
        FontAwesomeIcon faIcon = new FontAwesomeIcon(expected)
        faIcon.fontAwesome == expected
    }

    def 'Invalid FontAwesomeIcon arguments'() {
        when:
        new FontAwesomeIcon(arg)

        then:
        thrown(IllegalArgumentException)

        where:
        arg   | _
        ''    | _
        ' '   | _
        'foo' | _
    }
}
