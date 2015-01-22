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
package griffon.javafx.support.fontawesome;

import griffon.plugins.fontawesome.FontAwesome;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import javax.annotation.Nonnull;

import static griffon.util.GriffonClassUtils.requireState;

/**
 * @author Andres Almiray
 */
public class FontAwesomeIcon extends Label {
    private static final String AWESOME_SET = "META-INF/resources/webjars/font-awesome/4.2.0/fonts/fontawesome-webfont.ttf";

    static {
        Font.loadFont(Thread.currentThread().getContextClassLoader().getResource(AWESOME_SET).toExternalForm(), 16);
    }

    private final FontAwesome fontAwesome;
    private int iconSize;

    public FontAwesomeIcon(@Nonnull FontAwesome fontAwesome) {
        this.fontAwesome = fontAwesome;
        getStyleClass().add("fontawesome-icon");
        setText(String.valueOf(fontAwesome.getCode()));
        setStyle("-fx-font-family: FontAwesome;");
        setIconSize(16);
    }

    public FontAwesomeIcon(@Nonnull String description) {
        this(FontAwesome.findByDescription(description));
    }

    @Nonnull
    public FontAwesome getFontAwesome() {
        return fontAwesome;
    }

    public void setIconSize(int size) {
        requireState(size > 0, "Argument 'size' must be greater than zero.");
        setStyle(getStyle() + " -fx-font-size: " + size + "px;");
        this.iconSize = size;
    }

    public int getIconSize() {
        return iconSize;
    }
}
