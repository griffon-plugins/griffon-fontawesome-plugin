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

import com.sun.javafx.css.converters.EnumConverter;
import griffon.javafx.support.AbstractFontIcon;
import griffon.plugins.fontawesome.FontAwesome;
import javafx.beans.property.ObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.css.CssMetaData;
import javafx.css.Styleable;
import javafx.css.StyleableObjectProperty;
import javafx.css.StyleableProperty;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

import static griffon.util.GriffonNameUtils.requireNonBlank;
import static java.util.Collections.unmodifiableList;
import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class FontAwesomeIcon extends AbstractFontIcon {
    private static final String FONT_RESOURCE = "META-INF/resources/webjars/font-awesome/4.4.0/fonts/fontawesome-webfont.ttf";
    private static final String ERROR_FONT_NULL = "Argument 'fontAwesome' must not be null";
    private static final String FONT_FAMILY;

    static {
        Font font = Font.loadFont(Thread.currentThread().getContextClassLoader().getResource(FONT_RESOURCE).toExternalForm(), 16);
        FONT_FAMILY = font.getFamily();
    }

    private StyleableObjectProperty<FontAwesome> iconValue;

    private ChangeListener<FontAwesome> iconValueChangeListener = (v, o, n) -> setIconValue(n);

    public FontAwesomeIcon() {
        this(FontAwesome.FA_STAR);
    }

    public FontAwesomeIcon(@Nonnull FontAwesome fontAwesome) {
        getStyleClass().addAll("fontawesome-icon", "font-icon");
        setStyle("-fx-font-family: '" + FONT_FAMILY + "';");
        setIconValue(requireNonNull(fontAwesome, ERROR_FONT_NULL));
        setIconSize(16);
        setIconColor(Color.BLACK);
    }

    public FontAwesomeIcon(@Nonnull String description) {
        this(FontAwesome.findByDescription(description));
        resolveSize(description);
        resolvePaint(description);
    }

    @Nonnull
    public ObjectProperty<FontAwesome> iconValueProperty() {
        if (iconValue == null) {
            iconValue = new StyleableObjectProperty<FontAwesome>() {
                @Override
                public CssMetaData getCssMetaData() {
                    return StyleableProperties.VALUE;
                }

                @Override
                public Object getBean() {
                    return FontAwesomeIcon.this;
                }

                @Override
                public String getName() {
                    return "iconValue";
                }
            };
            iconValue.addListener(iconValueChangeListener);
        }
        return iconValue;
    }

    @Nonnull
    public ObjectProperty<FontAwesome> getIconValueProperty() {
        return iconValueProperty();
    }

    @Nonnull
    public FontAwesome getIconValue() {
        return iconValueProperty().get();
    }

    public void setIconValue(@Nonnull FontAwesome fontAwesome) {
        iconValueProperty().set(requireNonNull(fontAwesome, ERROR_FONT_NULL));
        setText(String.valueOf(fontAwesome.getCode()));
    }

    @Nonnull
    @Deprecated
    public ObjectProperty<FontAwesome> fontAwesomeProperty() {
        return iconValueProperty();
    }

    @Nonnull
    @Deprecated
    public ObjectProperty<FontAwesome> getFontAwesomeProperty() {
        return iconValueProperty();
    }

    @Nonnull
    @Deprecated
    public FontAwesome getFontAwesome() {
        return iconValueProperty().get();
    }

    @Deprecated
    public void setFontAwesome(@Nonnull FontAwesome fontAwesome) {
        iconValueProperty().set(requireNonNull(fontAwesome, ERROR_FONT_NULL));
        setText(String.valueOf(fontAwesome.getCode()));
    }

    @Deprecated
    public void setFontAwesome(@Nonnull String description) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        iconValueProperty().set(FontAwesome.findByDescription(description));
        resolveSize(description);
        resolvePaint(description);
    }

    @Override
    protected RuntimeException invalidDescription(@Nonnull String description, @Nonnull Exception exception) throws RuntimeException {
        return FontAwesome.invalidDescription(description, exception);
    }

    private static class StyleableProperties {
        private static final CssMetaData<FontAwesomeIcon, FontAwesome> VALUE =
            new CssMetaData<FontAwesomeIcon, FontAwesome>("-fx-icon-value",
                new EnumConverter<>(FontAwesome.class), FontAwesome.FA_STAR) {

                @Override
                public boolean isSettable(FontAwesomeIcon node) {
                    return true;
                }

                @Override
                public StyleableProperty<FontAwesome> getStyleableProperty(FontAwesomeIcon icon) {
                    return (StyleableProperty<FontAwesome>) icon.iconValueProperty();
                }
            };

        private static final List<CssMetaData<? extends Styleable, ?>> STYLEABLES;

        static {
            final List<CssMetaData<? extends Styleable, ?>> styleables =
                new ArrayList<>(AbstractFontIcon.getClassCssMetaData());
            styleables.add(VALUE);
            STYLEABLES = unmodifiableList(styleables);
        }
    }

    @Nonnull
    public static List<CssMetaData<? extends Styleable, ?>> getClassCssMetaData() {
        return StyleableProperties.STYLEABLES;
    }

    @Override
    public List<CssMetaData<? extends Styleable, ?>> getCssMetaData() {
        return FontAwesomeIcon.getClassCssMetaData();
    }
}
