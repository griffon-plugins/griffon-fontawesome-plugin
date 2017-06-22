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
package griffon.swing.support.fontawesome;

import griffon.plugins.fontawesome.FontAwesome;
import griffon.swing.support.AbstractFontIcon;

import javax.annotation.Nonnull;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;

import static griffon.util.GriffonNameUtils.requireNonBlank;
import static java.util.Objects.requireNonNull;

/**
 * Based on original code by Mario Torre<br/>
 * http://icedtea.classpath.org/people/neugens/SwingUIPatterns/file/f4528c35cc0c/src/main/java/org/icedtea/ui/patterns/swing/images/FontAwesomeIcon.java
 *
 * @author Andres Almiray
 */
public class FontAwesomeIcon extends AbstractFontIcon {
    private static final String FONT_RESOURCE = "META-INF/resources/webjars/font-awesome/4.4.0/fonts/fontawesome-webfont.ttf";
    private static final String ERROR_FONT_NULL = "Argument 'fontAwesome' must not be null";
    private static final Font FONT;

    private FontAwesome fontAwesome;

    static {
        try {
            InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(FONT_RESOURCE);
            FONT = Font.createFont(Font.TRUETYPE_FONT, stream);
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(FONT);
            stream.close();
        } catch (FontFormatException | IOException ffe) {
            throw new RuntimeException(ffe);
        }
    }

    public FontAwesomeIcon() {
        this(FontAwesome.FA_STAR);
    }

    public FontAwesomeIcon(@Nonnull FontAwesome fontAwesome) {
        setFontAwesome(fontAwesome);
    }

    public FontAwesomeIcon(@Nonnull String description) {
        this(FontAwesome.findByDescription(description));
        resolveSize(description);
        resolveColor(description);
    }

    @Nonnull
    public FontAwesome getFontAwesome() {
        return fontAwesome;
    }

    public void setFontAwesome(@Nonnull FontAwesome fontAwesome) {
        this.fontAwesome = requireNonNull(fontAwesome, ERROR_FONT_NULL);
    }

    public void setFontAwesome(@Nonnull String description) {
        requireNonBlank(description, "Argument 'description' must not be blank");
        setFontAwesome(FontAwesome.findByDescription(description));
        resolveSize(description);
        resolveColor(description);
    }

    @Override
    protected char resolveFontCode() {
        return fontAwesome.getCode();
    }

    @Nonnull
    @Override
    protected Font resolveFont() {
        return FONT;
    }

    @Override
    protected RuntimeException invalidDescription(@Nonnull String description, @Nonnull Exception exception) throws RuntimeException {
        return FontAwesome.invalidDescription(description, exception);
    }
}
