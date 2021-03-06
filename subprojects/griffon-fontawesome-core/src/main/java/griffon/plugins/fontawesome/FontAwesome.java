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
package griffon.plugins.fontawesome;

import javax.annotation.Nonnull;

import static griffon.util.GriffonNameUtils.requireNonBlank;

/**
 * @author Andres Almiray
 */
public enum FontAwesome implements FontValue {
    // last is f280
    FA_500PX("fa-500px", '\uf26e'),
    FA_ADJUST("fa-adjust", '\uf042'),
    FA_ADN("fa-adn", '\uf170'),
    FA_ALIGN_CENTER("fa-align-center", '\uf037'),
    FA_ALIGN_JUSTIFY("fa-align-justify", '\uf039'),
    FA_ALIGN_LEFT("fa-align-left", '\uf036'),
    FA_ALIGN_RIGHT("fa-align-right", '\uf038'),
    FA_AMAZON("fa-amazon", '\uf270'),
    FA_AMBULANCE("fa-ambulance", '\uf0f9'),
    FA_ANCHOR("fa-anchor", '\uf13d'),
    FA_ANDROID("fa-android", '\uf17b'),
    FA_ANGELLIST("fa-angellist", '\uf209'),
    FA_ANGLE_DOUBLE_DOWN("fa-angle-double-down", '\uf103'),
    FA_ANGLE_DOUBLE_LEFT("fa-angle-double-left", '\uf100'),
    FA_ANGLE_DOUBLE_RIGHT("fa-angle-double-right", '\uf101'),
    FA_ANGLE_DOUBLE_UP("fa-angle-double-up", '\uf102'),
    FA_ANGLE_DOWN("fa-angle-down", '\uf107'),
    FA_ANGLE_LEFT("fa-angle-left", '\uf104'),
    FA_ANGLE_RIGHT("fa-angle-right", '\uf105'),
    FA_ANGLE_UP("fa-angle-up", '\uf106'),
    FA_APPLE("fa-apple", '\uf179'),
    FA_ARCHIVE("fa-archive", '\uf187'),
    FA_AREA_CHART("fa-area-chart", '\uf1fe'),
    FA_ARROWS("fa-arrows", '\uf047'),
    FA_ARROWS_ALT("fa-arrows-alt", '\uf0b2'),
    FA_ARROWS_H("fa-arrows-h", '\uf07e'),
    FA_ARROWS_V("fa-arrows-v", '\uf07d'),
    FA_ARROW_CIRCLE_DOWN("fa-arrow-circle-down", '\uf0ab'),
    FA_ARROW_CIRCLE_LEFT("fa-arrow-circle-left", '\uf0a8'),
    FA_ARROW_CIRCLE_O_DOWN("fa-arrow-circle-o-down", '\uf01a'),
    FA_ARROW_CIRCLE_O_LEFT("fa-arrow-circle-o-left", '\uf190'),
    FA_ARROW_CIRCLE_O_RIGHT("fa-arrow-circle-o-right", '\uf18e'),
    FA_ARROW_CIRCLE_O_UP("fa-arrow-circle-o-up", '\uf01b'),
    FA_ARROW_CIRCLE_RIGHT("fa-arrow-circle-right", '\uf0a9'),
    FA_ARROW_CIRCLE_UP("fa-arrow-circle-up", '\uf0aa'),
    FA_ARROW_DOWN("fa-arrow-down", '\uf063'),
    FA_ARROW_LEFT("fa-arrow-left", '\uf060'),
    FA_ARROW_RIGHT("fa-arrow-right", '\uf061'),
    FA_ARROW_UP("fa-arrow-up", '\uf062'),
    FA_ASTERISK("fa-asterisk", '\uf069'),
    FA_AT("fa-at", '\uf1fa'),
    FA_AUTOMOBILE("fa-automobile", '\uf1b9'),
    FA_BACKWARD("fa-backward", '\uf04a'),
    FA_BALANCE_SCALE("fa-balance-scale", '\uf24e'),
    FA_BAN("fa-ban", '\uf05e'),
    FA_BANK("fa-bank", '\uf19c'),
    FA_BARCODE("fa-barcode", '\uf02a'),
    FA_BARS("fa-bars", '\uf0c9'),
    FA_BAR_CHART("fa-bar-chart", '\uf080'),
    FA_BAR_CHART_O("fa-bar-chart-o", '\uf080'),
    FA_BATTERY_0("fa-battery-0", '\uf244'),
    FA_BATTERY_1("fa-battery-1", '\uf243'),
    FA_BATTERY_2("fa-battery-2", '\uf242'),
    FA_BATTERY_3("fa-battery-3", '\uf241'),
    FA_BATTERY_4("fa-battery-4", '\uf240'),
    FA_BATTERY_EMPTY("fa-battery-empty", '\uf244'),
    FA_BATTERY_FULL("fa-battery-full", '\uf240'),
    FA_BATTERY_HALF("fa-battery-half", '\uf242'),
    FA_BATTERY_QUARTER("fa-battery-quarter", '\uf243'),
    FA_BATTERY_THREE_QUARTERS("fa-battery-three-quarters", '\uf241'),
    FA_BED("fa-bed", '\uf236'),
    FA_BEER("fa-beer", '\uf0fc'),
    FA_BEHANCE("fa-behance", '\uf1b4'),
    FA_BEHANCE_SQUARE("fa-behance-square", '\uf1b5'),
    FA_BELL("fa-bell", '\uf0f3'),
    FA_BELL_O("fa-bell-o", '\uf0a2'),
    FA_BELL_SLASH("fa-bell-slash", '\uf1f6'),
    FA_BELL_SLASH_O("fa-bell-slash-o", '\uf1f7'),
    FA_BICYCLE("fa-bicycle", '\uf206'),
    FA_BINOCULARS("fa-binoculars", '\uf1e5'),
    FA_BIRTHDAY_CAKE("fa-birthday-cake", '\uf1fd'),
    FA_BITBUCKET("fa-bitbucket", '\uf171'),
    FA_BITBUCKET_SQUARE("fa-bitbucket-square", '\uf172'),
    FA_BITCOIN("fa-bitcoin", '\uf15a'),
    FA_BLACK_TIE("fa-black-tie", '\uf27e'),
    FA_BOLD("fa-bold", '\uf032'),
    FA_BOLT("fa-bolt", '\uf0e7'),
    FA_BOMB("fa-bomb", '\uf1e2'),
    FA_BOOK("fa-book", '\uf02d'),
    FA_BOOKMARK("fa-bookmark", '\uf02e'),
    FA_BOOKMARK_O("fa-bookmark-o", '\uf097'),
    FA_BRIEFCASE("fa-briefcase", '\uf0b1'),
    FA_BTC("fa-btc", '\uf15a'),
    FA_BUG("fa-bug", '\uf188'),
    FA_BUILDING("fa-building", '\uf1ad'),
    FA_BUILDING_O("fa-building-o", '\uf0f7'),
    FA_BULLHORN("fa-bullhorn", '\uf0a1'),
    FA_BULLSEYE("fa-bullseye", '\uf140'),
    FA_BUS("fa-bus", '\uf207'),
    FA_BUYSELLADS("fa-buysellads", '\uf20d'),
    FA_CAB("fa-cab", '\uf1ba'),
    FA_CALCULATOR("fa-calculator", '\uf1ec'),
    FA_CALENDAR("fa-calendar", '\uf073'),
    FA_CALENDAR_CHECK_O("fa-calendar-check-o", '\uf274'),
    FA_CALENDAR_MINUS_O("fa-calendar-minus-o", '\uf272'),
    FA_CALENDAR_O("fa-calendar-o", '\uf133'),
    FA_CALENDAR_PLUS_O("fa-calendar-plus-o", '\uf271'),
    FA_CALENDAR_TIMES_O("fa-calendar-times-o", '\uf273'),
    FA_CAMERA("fa-camera", '\uf030'),
    FA_CAMERA_RETRO("fa-camera-retro", '\uf083'),
    FA_CAR("fa-car", '\uf1b9'),
    FA_CARET_DOWN("fa-caret-down", '\uf0d7'),
    FA_CARET_LEFT("fa-caret-left", '\uf0d9'),
    FA_CARET_RIGHT("fa-caret-right", '\uf0da'),
    FA_CARET_SQUARE_O_DOWN("fa-caret-square-o-down", '\uf150'),
    FA_CARET_SQUARE_O_LEFT("fa-caret-square-o-left", '\uf191'),
    FA_CARET_SQUARE_O_RIGHT("fa-caret-square-o-right", '\uf152'),
    FA_CARET_SQUARE_O_UP("fa-caret-square-o-up", '\uf151'),
    FA_CARET_UP("fa-caret-up", '\uf0d8'),
    FA_CART_ARROW_DOWN("fa-cart-arrow-down", '\uf218'),
    FA_CART_PLUS("fa-cart-plus", '\uf217'),
    FA_CC("fa-cc", '\uf20a'),
    FA_CC_AMEX("fa-cc-amex", '\uf1f3'),
    FA_CC_DINERS_CLUB("fa-cc-diners-club", '\uf24c'),
    FA_CC_DISCOVER("fa-cc-discover", '\uf1f2'),
    FA_CC_JCB("fa-cc-jcb", '\uf24b'),
    FA_CC_MASTERCARD("fa-cc-mastercard", '\uf1f1'),
    FA_CC_PAYPAL("fa-cc-paypal", '\uf1f4'),
    FA_CC_STRIPE("fa-cc-stripe", '\uf1f5'),
    FA_CC_VISA("fa-cc-visa", '\uf1f0'),
    FA_CERTIFICATE("fa-certificate", '\uf0a3'),
    FA_CHAIN("fa-chain", '\uf0c1'),
    FA_CHAIN_BROKEN("fa-chain-broken", '\uf127'),
    FA_CHECK("fa-check", '\uf00c'),
    FA_CHECK_CIRCLE("fa-check-circle", '\uf058'),
    FA_CHECK_CIRCLE_O("fa-check-circle-o", '\uf05d'),
    FA_CHECK_SQUARE("fa-check-square", '\uf14a'),
    FA_CHECK_SQUARE_O("fa-check-square-o", '\uf046'),
    FA_CHEVRON_CIRCLE_DOWN("fa-chevron-circle-down", '\uf13a'),
    FA_CHEVRON_CIRCLE_LEFT("fa-chevron-circle-left", '\uf137'),
    FA_CHEVRON_CIRCLE_RIGHT("fa-chevron-circle-right", '\uf138'),
    FA_CHEVRON_CIRCLE_UP("fa-chevron-circle-up", '\uf139'),
    FA_CHEVRON_DOWN("fa-chevron-down", '\uf078'),
    FA_CHEVRON_LEFT("fa-chevron-left", '\uf053'),
    FA_CHEVRON_RIGHT("fa-chevron-right", '\uf054'),
    FA_CHEVRON_UP("fa-chevron-up", '\uf077'),
    FA_CHILD("fa-child", '\uf1ae'),
    FA_CHROME("fa-chrome", '\uf268'),
    FA_CIRCLE("fa-circle", '\uf111'),
    FA_CIRCLE_O("fa-circle-o", '\uf10c'),
    FA_CIRCLE_O_NOTCH("fa-circle-o-notch", '\uf1ce'),
    FA_CIRCLE_THIN("fa-circle-thin", '\uf1db'),
    FA_CLIPBOARD("fa-clipboard", '\uf0ea'),
    FA_CLOCK_O("fa-clock-o", '\uf017'),
    FA_CLONE("fa-clone", '\uf24d'),
    FA_CLOSE("fa-close", '\uf00d'),
    FA_CLOUD("fa-cloud", '\uf0c2'),
    FA_CLOUD_DOWNLOAD("fa-cloud-download", '\uf0ed'),
    FA_CLOUD_UPLOAD("fa-cloud-upload", '\uf0ee'),
    FA_CNY("fa-cny", '\uf157'),
    FA_CODE("fa-code", '\uf121'),
    FA_CODEPEN("fa-codepen", '\uf1cb'),
    FA_CODE_FORK("fa-code-fork", '\uf126'),
    FA_COFFEE("fa-coffee", '\uf0f4'),
    FA_COG("fa-cog", '\uf013'),
    FA_COGS("fa-cogs", '\uf085'),
    FA_COLUMNS("fa-columns", '\uf0db'),
    FA_COMMENT("fa-comment", '\uf075'),
    FA_COMMENTING("fa-commenting", '\uf27a'),
    FA_COMMENTING_O("fa-commenting-o", '\uf27b'),
    FA_COMMENTS("fa-comments", '\uf086'),
    FA_COMMENTS_O("fa-comments-o", '\uf0e6'),
    FA_COMMENT_O("fa-comment-o", '\uf0e5'),
    FA_COMPASS("fa-compass", '\uf14e'),
    FA_COMPRESS("fa-compress", '\uf066'),
    FA_CONNECTDEVELOP("fa-connectdevelop", '\uf20e'),
    FA_CONTAO("fa-contao", '\uf26d'),
    FA_COPY("fa-copy", '\uf0c5'),
    FA_COPYRIGHT("fa-copyright", '\uf1f9'),
    FA_CREATIVE_COMMONS("fa-creative-commons", '\uf25e'),
    FA_CREDIT_CARD("fa-credit-card", '\uf09d'),
    FA_CROP("fa-crop", '\uf125'),
    FA_CROSSHAIRS("fa-crosshairs", '\uf05b'),
    FA_CSS3("fa-css3", '\uf13c'),
    FA_CUBE("fa-cube", '\uf1b2'),
    FA_CUBES("fa-cubes", '\uf1b3'),
    FA_CUT("fa-cut", '\uf0c4'),
    FA_CUTLERY("fa-cutlery", '\uf0f5'),
    FA_DASHBOARD("fa-dashboard", '\uf0e4'),
    FA_DASHCUBE("fa-dashcube", '\uf210'),
    FA_DATABASE("fa-database", '\uf1c0'),
    FA_DEDENT("fa-dedent", '\uf03b'),
    FA_DELICIOUS("fa-delicious", '\uf1a5'),
    FA_DESKTOP("fa-desktop", '\uf108'),
    FA_DEVIANTART("fa-deviantart", '\uf1bd'),
    FA_DIAMOND("fa-diamond", '\uf219'),
    FA_DIGG("fa-digg", '\uf1a6'),
    FA_DOLLAR("fa-dollar", '\uf155'),
    FA_DOT_CIRCLE_O("fa-dot-circle-o", '\uf192'),
    FA_DOWNLOAD("fa-download", '\uf019'),
    FA_DRIBBBLE("fa-dribbble", '\uf17d'),
    FA_DROPBOX("fa-dropbox", '\uf16b'),
    FA_DRUPAL("fa-drupal", '\uf1a9'),
    FA_EDIT("fa-edit", '\uf044'),
    FA_EJECT("fa-eject", '\uf052'),
    FA_ELLIPSIS_H("fa-ellipsis-h", '\uf141'),
    FA_ELLIPSIS_V("fa-ellipsis-v", '\uf142'),
    FA_EMPIRE("fa-empire", '\uf1d1'),
    FA_ENVELOPE("fa-envelope", '\uf0e0'),
    FA_ENVELOPE_O("fa-envelope-o", '\uf003'),
    FA_ENVELOPE_SQUARE("fa-envelope-square", '\uf199'),
    FA_ERASER("fa-eraser", '\uf12d'),
    FA_EUR("fa-eur", '\uf153'),
    FA_EURO("fa-euro", '\uf153'),
    FA_EXCHANGE("fa-exchange", '\uf0ec'),
    FA_EXCLAMATION("fa-exclamation", '\uf12a'),
    FA_EXCLAMATION_CIRCLE("fa-exclamation-circle", '\uf06a'),
    FA_EXCLAMATION_TRIANGLE("fa-exclamation-triangle", '\uf071'),
    FA_EXPAND("fa-expand", '\uf065'),
    FA_EXPEDITEDSSL("fa-expeditedssl", '\uf23e'),
    FA_EXTERNAL_LINK("fa-external-link", '\uf08e'),
    FA_EXTERNAL_LINK_SQUARE("fa-external-link-square", '\uf14c'),
    FA_EYE("fa-eye", '\uf06e'),
    FA_EYEDROPPER("fa-eyedropper", '\uf1fb'),
    FA_EYE_SLASH("fa-eye-slash", '\uf070'),
    FA_FACEBOOK("fa-facebook", '\uf09a'),
    FA_FACEBOOK_F("fa-facebook-f", '\uf09a'),
    FA_FACEBOOK_OFFICIAL("fa-facebook-official", '\uf230'),
    FA_FACEBOOK_SQUARE("fa-facebook-square", '\uf082'),
    FA_FAST_BACKWARD("fa-fast-backward", '\uf049'),
    FA_FAST_FORWARD("fa-fast-forward", '\uf050'),
    FA_FAX("fa-fax", '\uf1ac'),
    FA_FEMALE("fa-female", '\uf182'),
    FA_FIGHTER_JET("fa-fighter-jet", '\uf0fb'),
    FA_FILE("fa-file", '\uf15b'),
    FA_FILES_O("fa-files-o", '\uf0c5'),
    FA_FILE_ARCHIVE_O("fa-file-archive-o", '\uf1c6'),
    FA_FILE_AUDIO_O("fa-file-audio-o", '\uf1c7'),
    FA_FILE_CODE_O("fa-file-code-o", '\uf1c9'),
    FA_FILE_EXCEL_O("fa-file-excel-o", '\uf1c3'),
    FA_FILE_IMAGE_O("fa-file-image-o", '\uf1c5'),
    FA_FILE_MOVIE_O("fa-file-movie-o", '\uf1c8'),
    FA_FILE_O("fa-file-o", '\uf016'),
    FA_FILE_PDF_O("fa-file-pdf-o", '\uf1c1'),
    FA_FILE_PHOTO_O("fa-file-photo-o", '\uf1c5'),
    FA_FILE_PICTURE_O("fa-file-picture-o", '\uf1c5'),
    FA_FILE_POWERPOINT_O("fa-file-powerpoint-o", '\uf1c4'),
    FA_FILE_SOUND_O("fa-file-sound-o", '\uf1c7'),
    FA_FILE_TEXT("fa-file-text", '\uf15c'),
    FA_FILE_TEXT_O("fa-file-text-o", '\uf0f6'),
    FA_FILE_VIDEO_O("fa-file-video-o", '\uf1c8'),
    FA_FILE_WORD_O("fa-file-word-o", '\uf1c2'),
    FA_FILE_ZIP_O("fa-file-zip-o", '\uf1c6'),
    FA_FILM("fa-film", '\uf008'),
    FA_FILTER("fa-filter", '\uf0b0'),
    FA_FIRE("fa-fire", '\uf06d'),
    FA_FIREFOX("fa-firefox", '\uf269'),
    FA_FIRE_EXTINGUISHER("fa-fire-extinguisher", '\uf134'),
    FA_FLAG("fa-flag", '\uf024'),
    FA_FLAG_CHECKERED("fa-flag-checkered", '\uf11e'),
    FA_FLAG_O("fa-flag-o", '\uf11d'),
    FA_FLASH("fa-flash", '\uf0e7'),
    FA_FLASK("fa-flask", '\uf0c3'),
    FA_FLICKR("fa-flickr", '\uf16e'),
    FA_FLOPPY_O("fa-floppy-o", '\uf0c7'),
    FA_FOLDER("fa-folder", '\uf07b'),
    FA_FOLDER_O("fa-folder-o", '\uf114'),
    FA_FOLDER_OPEN("fa-folder-open", '\uf07c'),
    FA_FOLDER_OPEN_O("fa-folder-open-o", '\uf115'),
    FA_FONT("fa-font", '\uf031'),
    FA_FONTICONS("fa-fonticons", '\uf280'),
    FA_FORUMBEE("fa-forumbee", '\uf211'),
    FA_FORWARD("fa-forward", '\uf04e'),
    FA_FOURSQUARE("fa-foursquare", '\uf180'),
    FA_FROWN_O("fa-frown-o", '\uf119'),
    FA_FUTBOL_O("fa-futbol-o", '\uf1e3'),
    FA_GAMEPAD("fa-gamepad", '\uf11b'),
    FA_GAVEL("fa-gavel", '\uf0e3'),
    FA_GBP("fa-gbp", '\uf154'),
    FA_GE("fa-ge", '\uf1d1'),
    FA_GEAR("fa-gear", '\uf013'),
    FA_GEARS("fa-gears", '\uf085'),
    FA_GENDERLESS("fa-genderless", '\uf1db'),
    FA_GET_POCKET("fa-get-pocket", '\uf265'),
    FA_GG("fa-gg", '\uf260'),
    FA_GG_CIRCLE("fa-gg-circle", '\uf261'),
    FA_GIFT("fa-gift", '\uf06b'),
    FA_GIT("fa-git", '\uf1d3'),
    FA_GITHUB("fa-github", '\uf09b'),
    FA_GITHUB_ALT("fa-github-alt", '\uf113'),
    FA_GITHUB_SQUARE("fa-github-square", '\uf092'),
    FA_GITTIP("fa-gittip", '\uf184'),
    FA_GIT_SQUARE("fa-git-square", '\uf1d2'),
    FA_GLASS("fa-glass", '\uf000'),
    FA_GLOBE("fa-globe", '\uf0ac'),
    FA_GOOGLE("fa-google", '\uf1a0'),
    FA_GOOGLE_PLUS("fa-google-plus", '\uf0d5'),
    FA_GOOGLE_PLUS_SQUARE("fa-google-plus-square", '\uf0d4'),
    FA_GOOGLE_WALLET("fa-google-wallet", '\uf1ee'),
    FA_GRADUATION_CAP("fa-graduation-cap", '\uf19d'),
    FA_GRATIPAY("fa-gratipay", '\uf184'),
    FA_GROUP("fa-group", '\uf0c0'),
    FA_HACKER_NEWS("fa-hacker-news", '\uf1d4'),
    FA_HAND_GRAB_O("fa-hand-grab-o", '\uf255'),
    FA_HAND_LIZARD_O("fa-hand-lizard-o", '\uf258'),
    FA_HAND_O_DOWN("fa-hand-o-down", '\uf0a7'),
    FA_HAND_O_LEFT("fa-hand-o-left", '\uf0a5'),
    FA_HAND_O_RIGHT("fa-hand-o-right", '\uf0a4'),
    FA_HAND_O_UP("fa-hand-o-up", '\uf0a6'),
    FA_HAND_PAPER_O("fa-hand-paper-o", '\uf256'),
    FA_HAND_PEACE_O("fa-hand-peace-o", '\uf25b'),
    FA_HAND_POINTER_O("fa-hand-pointer-o", '\uf25a'),
    FA_HAND_ROCK_O("fa-hand-rock-o", '\uf255'),
    FA_HAND_SCISSORS_O("fa-hand-scissors-o", '\uf257'),
    FA_HAND_SPOCK_O("fa-hand-spock-o", '\uf259'),
    FA_HAND_STOP_O("fa-hand-stop-o", '\uf256'),
    FA_HDD_O("fa-hdd-o", '\uf0a0'),
    FA_HEADER("fa-header", '\uf1dc'),
    FA_HEADPHONES("fa-headphones", '\uf025'),
    FA_HEART("fa-heart", '\uf004'),
    FA_HEARTBEAT("fa-heartbeat", '\uf21e'),
    FA_HEART_O("fa-heart-o", '\uf08a'),
    FA_HISTORY("fa-history", '\uf1da'),
    FA_HOME("fa-home", '\uf015'),
    FA_HOSPITAL_O("fa-hospital-o", '\uf0f8'),
    FA_HOTEL("fa-hotel", '\uf236'),
    FA_HOURGLASS("fa-hourglass", '\uf254'),
    FA_HOURGLASS_1("fa-hourglass-1", '\uf251'),
    FA_HOURGLASS_2("fa-hourglass-2", '\uf252'),
    FA_HOURGLASS_3("fa-hourglass-3", '\uf253'),
    FA_HOURGLASS_END("fa-hourglass-end", '\uf253'),
    FA_HOURGLASS_HALF("fa-hourglass-half", '\uf252'),
    FA_HOURGLASS_O("fa-hourglass-o", '\uf250'),
    FA_HOURGLASS_START("fa-hourglass-start", '\uf251'),
    FA_HOUZZ("fa-houzz", '\uf27c'),
    FA_HTML5("fa-html5", '\uf13b'),
    FA_H_SQUARE("fa-h-square", '\uf0fd'),
    FA_ILS("fa-ils", '\uf20b'),
    FA_IMAGE("fa-image", '\uf03e'),
    FA_INBOX("fa-inbox", '\uf01c'),
    FA_INDENT("fa-indent", '\uf03c'),
    FA_INDUSTRY("fa-industry", '\uf275'),
    FA_INFO("fa-info", '\uf129'),
    FA_INFO_CIRCLE("fa-info-circle", '\uf05a'),
    FA_INR("fa-inr", '\uf156'),
    FA_INSTAGRAM("fa-instagram", '\uf16d'),
    FA_INSTITUTION("fa-institution", '\uf19c'),
    FA_INTERNET_EXPLORER("fa-internet-explorer", '\uf26b'),
    FA_IOXHOST("fa-ioxhost", '\uf208'),
    FA_ITALIC("fa-italic", '\uf033'),
    FA_I_CURSOR("fa-i-cursor", '\uf246'),
    FA_JOOMLA("fa-joomla", '\uf1aa'),
    FA_JPY("fa-jpy", '\uf157'),
    FA_JSFIDDLE("fa-jsfiddle", '\uf1cc'),
    FA_KEY("fa-key", '\uf084'),
    FA_KEYBOARD_O("fa-keyboard-o", '\uf11c'),
    FA_KRW("fa-krw", '\uf159'),
    FA_LANGUAGE("fa-language", '\uf1ab'),
    FA_LAPTOP("fa-laptop", '\uf109'),
    FA_LASTFM("fa-lastfm", '\uf202'),
    FA_LASTFM_SQUARE("fa-lastfm-square", '\uf203'),
    FA_LEAF("fa-leaf", '\uf06c'),
    FA_LEANPUB("fa-leanpub", '\uf212'),
    FA_LEGAL("fa-legal", '\uf0e3'),
    FA_LEMON_O("fa-lemon-o", '\uf094'),
    FA_LEVEL_DOWN("fa-level-down", '\uf149'),
    FA_LEVEL_UP("fa-level-up", '\uf148'),
    FA_LIFE_BOUY("fa-life-bouy", '\uf1cd'),
    FA_LIFE_BUOY("fa-life-buoy", '\uf1cd'),
    FA_LIFE_RING("fa-life-ring", '\uf1cd'),
    FA_LIFE_SAVER("fa-life-saver", '\uf1cd'),
    FA_LIGHTBULB_O("fa-lightbulb-o", '\uf0eb'),
    FA_LINE_CHART("fa-line-chart", '\uf201'),
    FA_LINK("fa-link", '\uf0c1'),
    FA_LINKEDIN("fa-linkedin", '\uf0e1'),
    FA_LINKEDIN_SQUARE("fa-linkedin-square", '\uf08c'),
    FA_LINUX("fa-linux", '\uf17c'),
    FA_LIST("fa-list", '\uf03a'),
    FA_LIST_ALT("fa-list-alt", '\uf022'),
    FA_LIST_OL("fa-list-ol", '\uf0cb'),
    FA_LIST_UL("fa-list-ul", '\uf0ca'),
    FA_LOCATION_ARROW("fa-location-arrow", '\uf124'),
    FA_LOCK("fa-lock", '\uf023'),
    FA_LONG_ARROW_DOWN("fa-long-arrow-down", '\uf175'),
    FA_LONG_ARROW_LEFT("fa-long-arrow-left", '\uf177'),
    FA_LONG_ARROW_RIGHT("fa-long-arrow-right", '\uf178'),
    FA_LONG_ARROW_UP("fa-long-arrow-up", '\uf176'),
    FA_MAGIC("fa-magic", '\uf0d0'),
    FA_MAGNET("fa-magnet", '\uf076'),
    FA_MAIL_FORWARD("fa-mail-forward", '\uf064'),
    FA_MAIL_REPLY("fa-mail-reply", '\uf112'),
    FA_MAIL_REPLY_ALL("fa-mail-reply-all", '\uf122'),
    FA_MALE("fa-male", '\uf183'),
    FA_MAP("fa-map", '\uf279'),
    FA_MAP_MARKER("fa-map-marker", '\uf041'),
    FA_MAP_O("fa-map-o", '\uf278'),
    FA_MAP_PIN("fa-map-pin", '\uf276'),
    FA_MAP_SIGNS("fa-map-signs", '\uf277'),
    FA_MARS("fa-mars", '\uf222'),
    FA_MARS_DOUBLE("fa-mars-double", '\uf227'),
    FA_MARS_STROKE("fa-mars-stroke", '\uf229'),
    FA_MARS_STROKE_H("fa-mars-stroke-h", '\uf22b'),
    FA_MARS_STROKE_V("fa-mars-stroke-v", '\uf22a'),
    FA_MAXCDN("fa-maxcdn", '\uf136'),
    FA_MEANPATH("fa-meanpath", '\uf20c'),
    FA_MEDIUM("fa-medium", '\uf23a'),
    FA_MEDKIT("fa-medkit", '\uf0fa'),
    FA_MEH_O("fa-meh-o", '\uf11a'),
    FA_MERCURY("fa-mercury", '\uf223'),
    FA_MICROPHONE("fa-microphone", '\uf130'),
    FA_MICROPHONE_SLASH("fa-microphone-slash", '\uf131'),
    FA_MINUS("fa-minus", '\uf068'),
    FA_MINUS_CIRCLE("fa-minus-circle", '\uf056'),
    FA_MINUS_SQUARE("fa-minus-square", '\uf146'),
    FA_MINUS_SQUARE_O("fa-minus-square-o", '\uf147'),
    FA_MOBILE("fa-mobile", '\uf10b'),
    FA_MOBILE_PHONE("fa-mobile-phone", '\uf10b'),
    FA_MONEY("fa-money", '\uf0d6'),
    FA_MOON_O("fa-moon-o", '\uf186'),
    FA_MORTAR_BOARD("fa-mortar-board", '\uf19d'),
    FA_MOTORCYCLE("fa-motorcycle", '\uf21c'),
    FA_MOUSE_POINTER("fa-mouse-pointer", '\uf245'),
    FA_MUSIC("fa-music", '\uf001'),
    FA_NAVICON("fa-navicon", '\uf0c9'),
    FA_NEUTER("fa-neuter", '\uf22c'),
    FA_NEWSPAPER_O("fa-newspaper-o", '\uf1ea'),
    FA_OBJECT_GROUP("fa-object-group", '\uf247'),
    FA_OBJECT_UNGROUP("fa-object-ungroup", '\uf248'),
    FA_ODNOKLASSNIKI("fa-odnoklassniki", '\uf263'),
    FA_ODNOKLASSNIKI_SQUARE("fa-odnoklassniki-square", '\uf264'),
    FA_OPENCART("fa-opencart", '\uf23d'),
    FA_OPENID("fa-openid", '\uf19b'),
    FA_OPERA("fa-opera", '\uf26a'),
    FA_OPTIN_MONSTER("fa-optin-monster", '\uf23c'),
    FA_OUTDENT("fa-outdent", '\uf03b'),
    FA_PAGELINES("fa-pagelines", '\uf18c'),
    FA_PAINT_BRUSH("fa-paint-brush", '\uf1fc'),
    FA_PAPERCLIP("fa-paperclip", '\uf0c6'),
    FA_PAPER_PLANE("fa-paper-plane", '\uf1d8'),
    FA_PAPER_PLANE_O("fa-paper-plane-o", '\uf1d9'),
    FA_PARAGRAPH("fa-paragraph", '\uf1dd'),
    FA_PASTE("fa-paste", '\uf0ea'),
    FA_PAUSE("fa-pause", '\uf04c'),
    FA_PAW("fa-paw", '\uf1b0'),
    FA_PAYPAL("fa-paypal", '\uf1ed'),
    FA_PENCIL("fa-pencil", '\uf040'),
    FA_PENCIL_SQUARE("fa-pencil-square", '\uf14b'),
    FA_PENCIL_SQUARE_O("fa-pencil-square-o", '\uf044'),
    FA_PHONE("fa-phone", '\uf095'),
    FA_PHONE_SQUARE("fa-phone-square", '\uf098'),
    FA_PHOTO("fa-photo", '\uf03e'),
    FA_PICTURE_O("fa-picture-o", '\uf03e'),
    FA_PIED_PIPER("fa-pied-piper", '\uf1a7'),
    FA_PIED_PIPER_ALT("fa-pied-piper-alt", '\uf1a8'),
    FA_PIE_CHART("fa-pie-chart", '\uf200'),
    FA_PINTEREST("fa-pinterest", '\uf0d2'),
    FA_PINTEREST_P("fa-pinterest-p", '\uf231'),
    FA_PINTEREST_SQUARE("fa-pinterest-square", '\uf0d3'),
    FA_PLANE("fa-plane", '\uf072'),
    FA_PLAY("fa-play", '\uf04b'),
    FA_PLAY_CIRCLE("fa-play-circle", '\uf144'),
    FA_PLAY_CIRCLE_O("fa-play-circle-o", '\uf01d'),
    FA_PLUG("fa-plug", '\uf1e6'),
    FA_PLUS("fa-plus", '\uf067'),
    FA_PLUS_CIRCLE("fa-plus-circle", '\uf055'),
    FA_PLUS_SQUARE("fa-plus-square", '\uf0fe'),
    FA_PLUS_SQUARE_O("fa-plus-square-o", '\uf196'),
    FA_POWER_OFF("fa-power-off", '\uf011'),
    FA_PRINT("fa-print", '\uf02f'),
    FA_PUZZLE_PIECE("fa-puzzle-piece", '\uf12e'),
    FA_QQ("fa-qq", '\uf1d6'),
    FA_QRCODE("fa-qrcode", '\uf029'),
    FA_QUESTION("fa-question", '\uf128'),
    FA_QUESTION_CIRCLE("fa-question-circle", '\uf059'),
    FA_QUOTE_LEFT("fa-quote-left", '\uf10d'),
    FA_QUOTE_RIGHT("fa-quote-right", '\uf10e'),
    FA_RA("fa-ra", '\uf1d0'),
    FA_RANDOM("fa-random", '\uf074'),
    FA_REBEL("fa-rebel", '\uf1d0'),
    FA_RECYCLE("fa-recycle", '\uf1b8'),
    FA_REDDIT("fa-reddit", '\uf1a1'),
    FA_REDDIT_SQUARE("fa-reddit-square", '\uf1a2'),
    FA_REFRESH("fa-refresh", '\uf021'),
    FA_REGISTERED("fa-registered", '\uf25d'),
    FA_REMOVE("fa-remove", '\uf00d'),
    FA_RENREN("fa-renren", '\uf18b'),
    FA_REORDER("fa-reorder", '\uf0c9'),
    FA_REPEAT("fa-repeat", '\uf01e'),
    FA_REPLY("fa-reply", '\uf112'),
    FA_REPLY_ALL("fa-reply-all", '\uf122'),
    FA_RETWEET("fa-retweet", '\uf079'),
    FA_RMB("fa-rmb", '\uf157'),
    FA_ROAD("fa-road", '\uf018'),
    FA_ROCKET("fa-rocket", '\uf135'),
    FA_ROTATE_LEFT("fa-rotate-left", '\uf0e2'),
    FA_ROTATE_RIGHT("fa-rotate-right", '\uf01e'),
    FA_ROUBLE("fa-rouble", '\uf158'),
    FA_RSS("fa-rss", '\uf09e'),
    FA_RSS_SQUARE("fa-rss-square", '\uf143'),
    FA_RUB("fa-rub", '\uf158'),
    FA_RUBLE("fa-ruble", '\uf158'),
    FA_RUPEE("fa-rupee", '\uf156'),
    FA_SAFARI("fa-safari", '\uf267'),
    FA_SAVE("fa-save", '\uf0c7'),
    FA_SCISSORS("fa-scissors", '\uf0c4'),
    FA_SEARCH("fa-search", '\uf002'),
    FA_SEARCH_MINUS("fa-search-minus", '\uf010'),
    FA_SEARCH_PLUS("fa-search-plus", '\uf00e'),
    FA_SELLSY("fa-sellsy", '\uf213'),
    FA_SEND("fa-send", '\uf1d8'),
    FA_SEND_O("fa-send-o", '\uf1d9'),
    FA_SERVER("fa-server", '\uf233'),
    FA_SHARE("fa-share", '\uf064'),
    FA_SHARE_ALT("fa-share-alt", '\uf1e0'),
    FA_SHARE_ALT_SQUARE("fa-share-alt-square", '\uf1e1'),
    FA_SHARE_SQUARE("fa-share-square", '\uf14d'),
    FA_SHARE_SQUARE_O("fa-share-square-o", '\uf045'),
    FA_SHEKEL("fa-shekel", '\uf20b'),
    FA_SHEQEL("fa-sheqel", '\uf20b'),
    FA_SHIELD("fa-shield", '\uf132'),
    FA_SHIP("fa-ship", '\uf21a'),
    FA_SHIRTSINBULK("fa-shirtsinbulk", '\uf214'),
    FA_SHOPPING_CART("fa-shopping-cart", '\uf07a'),
    FA_SIGNAL("fa-signal", '\uf012'),
    FA_SIGN_IN("fa-sign-in", '\uf090'),
    FA_SIGN_OUT("fa-sign-out", '\uf08b'),
    FA_SIMPLYBUILT("fa-simplybuilt", '\uf215'),
    FA_SITEMAP("fa-sitemap", '\uf0e8'),
    FA_SKYATLAS("fa-skyatlas", '\uf216'),
    FA_SKYPE("fa-skype", '\uf17e'),
    FA_SLACK("fa-slack", '\uf198'),
    FA_SLIDERS("fa-sliders", '\uf1de'),
    FA_SLIDESHARE("fa-slideshare", '\uf1e7'),
    FA_SMILE_O("fa-smile-o", '\uf118'),
    FA_SOCCER_BALL_O("fa-soccer-ball-o", '\uf1e3'),
    FA_SORT("fa-sort", '\uf0dc'),
    FA_SORT_ALPHA_ASC("fa-sort-alpha-asc", '\uf15d'),
    FA_SORT_ALPHA_DESC("fa-sort-alpha-desc", '\uf15e'),
    FA_SORT_AMOUNT_ASC("fa-sort-amount-asc", '\uf160'),
    FA_SORT_AMOUNT_DESC("fa-sort-amount-desc", '\uf161'),
    FA_SORT_ASC("fa-sort-asc", '\uf0de'),
    FA_SORT_DESC("fa-sort-desc", '\uf0dd'),
    FA_SORT_DOWN("fa-sort-down", '\uf0dd'),
    FA_SORT_NUMERIC_ASC("fa-sort-numeric-asc", '\uf162'),
    FA_SORT_NUMERIC_DESC("fa-sort-numeric-desc", '\uf163'),
    FA_SORT_UP("fa-sort-up", '\uf0de'),
    FA_SOUNDCLOUD("fa-soundcloud", '\uf1be'),
    FA_SPACE_SHUTTLE("fa-space-shuttle", '\uf197'),
    FA_SPINNER("fa-spinner", '\uf110'),
    FA_SPOON("fa-spoon", '\uf1b1'),
    FA_SPOTIFY("fa-spotify", '\uf1bc'),
    FA_SQUARE("fa-square", '\uf0c8'),
    FA_SQUARE_O("fa-square-o", '\uf096'),
    FA_STACK_EXCHANGE("fa-stack-exchange", '\uf18d'),
    FA_STACK_OVERFLOW("fa-stack-overflow", '\uf16c'),
    FA_STAR("fa-star", '\uf005'),
    FA_STAR_HALF("fa-star-half", '\uf089'),
    FA_STAR_HALF_EMPTY("fa-star-half-empty", '\uf123'),
    FA_STAR_HALF_FULL("fa-star-half-full", '\uf123'),
    FA_STAR_HALF_O("fa-star-half-o", '\uf123'),
    FA_STAR_O("fa-star-o", '\uf006'),
    FA_STEAM("fa-steam", '\uf1b6'),
    FA_STEAM_SQUARE("fa-steam-square", '\uf1b7'),
    FA_STEP_BACKWARD("fa-step-backward", '\uf048'),
    FA_STEP_FORWARD("fa-step-forward", '\uf051'),
    FA_STETHOSCOPE("fa-stethoscope", '\uf0f1'),
    FA_STICKY_NOTE("fa-sticky-note", '\uf249'),
    FA_STICKY_NOTE_O("fa-sticky-note-o", '\uf24a'),
    FA_STOP("fa-stop", '\uf04d'),
    FA_STREET_VIEW("fa-street-view", '\uf21d'),
    FA_STRIKETHROUGH("fa-strikethrough", '\uf0cc'),
    FA_STUMBLEUPON("fa-stumbleupon", '\uf1a4'),
    FA_STUMBLEUPON_CIRCLE("fa-stumbleupon-circle", '\uf1a3'),
    FA_SUBSCRIPT("fa-subscript", '\uf12c'),
    FA_SUBWAY("fa-subway", '\uf239'),
    FA_SUITCASE("fa-suitcase", '\uf0f2'),
    FA_SUN_O("fa-sun-o", '\uf185'),
    FA_SUPERSCRIPT("fa-superscript", '\uf12b'),
    FA_SUPPORT("fa-support", '\uf1cd'),
    FA_TABLE("fa-table", '\uf0ce'),
    FA_TABLET("fa-tablet", '\uf10a'),
    FA_TACHOMETER("fa-tachometer", '\uf0e4'),
    FA_TAG("fa-tag", '\uf02b'),
    FA_TAGS("fa-tags", '\uf02c'),
    FA_TASKS("fa-tasks", '\uf0ae'),
    FA_TAXI("fa-taxi", '\uf1ba'),
    FA_TELEVISION("fa-television", '\uf26c'),
    FA_TENCENT_WEIBO("fa-tencent-weibo", '\uf1d5'),
    FA_TERMINAL("fa-terminal", '\uf120'),
    FA_TEXT_HEIGHT("fa-text-height", '\uf034'),
    FA_TEXT_WIDTH("fa-text-width", '\uf035'),
    FA_TH("fa-th", '\uf00a'),
    FA_THUMBS_DOWN("fa-thumbs-down", '\uf165'),
    FA_THUMBS_O_DOWN("fa-thumbs-o-down", '\uf088'),
    FA_THUMBS_O_UP("fa-thumbs-o-up", '\uf087'),
    FA_THUMBS_UP("fa-thumbs-up", '\uf164'),
    FA_THUMB_TACK("fa-thumb-tack", '\uf08d'),
    FA_TH_LARGE("fa-th-large", '\uf009'),
    FA_TH_LIST("fa-th-list", '\uf00b'),
    FA_TICKET("fa-ticket", '\uf145'),
    FA_TIMES("fa-times", '\uf00d'),
    FA_TIMES_CIRCLE("fa-times-circle", '\uf057'),
    FA_TIMES_CIRCLE_O("fa-times-circle-o", '\uf05c'),
    FA_TINT("fa-tint", '\uf043'),
    FA_TOGGLE_DOWN("fa-toggle-down", '\uf150'),
    FA_TOGGLE_LEFT("fa-toggle-left", '\uf191'),
    FA_TOGGLE_OFF("fa-toggle-off", '\uf204'),
    FA_TOGGLE_ON("fa-toggle-on", '\uf205'),
    FA_TOGGLE_RIGHT("fa-toggle-right", '\uf152'),
    FA_TOGGLE_UP("fa-toggle-up", '\uf151'),
    FA_TRADEMARK("fa-trademark", '\uf25c'),
    FA_TRAIN("fa-train", '\uf238'),
    FA_TRANSGENDER("fa-transgender", '\uf224'),
    FA_TRANSGENDER_ALT("fa-transgender-alt", '\uf225'),
    FA_TRASH("fa-trash", '\uf1f8'),
    FA_TRASH_O("fa-trash-o", '\uf014'),
    FA_TREE("fa-tree", '\uf1bb'),
    FA_TRELLO("fa-trello", '\uf181'),
    FA_TRIPADVISOR("fa-tripadvisor", '\uf262'),
    FA_TROPHY("fa-trophy", '\uf091'),
    FA_TRUCK("fa-truck", '\uf0d1'),
    FA_TRY("fa-try", '\uf195'),
    FA_TTY("fa-tty", '\uf1e4'),
    FA_TUMBLR("fa-tumblr", '\uf173'),
    FA_TUMBLR_SQUARE("fa-tumblr-square", '\uf174'),
    FA_TURKISH_LIRA("fa-turkish-lira", '\uf195'),
    FA_TV("fa-tv", '\uf26c'),
    FA_TWITCH("fa-twitch", '\uf1e8'),
    FA_TWITTER("fa-twitter", '\uf099'),
    FA_TWITTER_SQUARE("fa-twitter-square", '\uf081'),
    FA_UMBRELLA("fa-umbrella", '\uf0e9'),
    FA_UNDERLINE("fa-underline", '\uf0cd'),
    FA_UNDO("fa-undo", '\uf0e2'),
    FA_UNIVERSITY("fa-university", '\uf19c'),
    FA_UNLINK("fa-unlink", '\uf127'),
    FA_UNLOCK("fa-unlock", '\uf09c'),
    FA_UNLOCK_ALT("fa-unlock-alt", '\uf13e'),
    FA_UNSORTED("fa-unsorted", '\uf0dc'),
    FA_UPLOAD("fa-upload", '\uf093'),
    FA_USD("fa-usd", '\uf155'),
    FA_USER("fa-user", '\uf007'),
    FA_USERS("fa-users", '\uf0c0'),
    FA_USER_MD("fa-user-md", '\uf0f0'),
    FA_USER_PLUS("fa-user-plus", '\uf234'),
    FA_USER_SECRET("fa-user-secret", '\uf21b'),
    FA_USER_TIMES("fa-user-times", '\uf235'),
    FA_VENUS("fa-venus", '\uf221'),
    FA_VENUS_DOUBLE("fa-venus-double", '\uf226'),
    FA_VENUS_MARS("fa-venus-mars", '\uf228'),
    FA_VIACOIN("fa-viacoin", '\uf237'),
    FA_VIDEO_CAMERA("fa-video-camera", '\uf03d'),
    FA_VIMEO("fa-vimeo", '\uf27d'),
    FA_VIMEO_SQUARE("fa-vimeo-square", '\uf194'),
    FA_VINE("fa-vine", '\uf1ca'),
    FA_VK("fa-vk", '\uf189'),
    FA_VOLUME_DOWN("fa-volume-down", '\uf027'),
    FA_VOLUME_OFF("fa-volume-off", '\uf026'),
    FA_VOLUME_UP("fa-volume-up", '\uf028'),
    FA_WARNING("fa-warning", '\uf071'),
    FA_WECHAT("fa-wechat", '\uf1d7'),
    FA_WEIBO("fa-weibo", '\uf18a'),
    FA_WEIXIN("fa-weixin", '\uf1d7'),
    FA_WHATSAPP("fa-whatsapp", '\uf232'),
    FA_WHEELCHAIR("fa-wheelchair", '\uf193'),
    FA_WIFI("fa-wifi", '\uf1eb'),
    FA_WIKIPEDIA_W("fa-wikipedia-w", '\uf266'),
    FA_WINDOWS("fa-windows", '\uf17a'),
    FA_WON("fa-won", '\uf159'),
    FA_WORDPRESS("fa-wordpress", '\uf19a'),
    FA_WRENCH("fa-wrench", '\uf0ad'),
    FA_XING("fa-xing", '\uf168'),
    FA_XING_SQUARE("fa-xing-square", '\uf169'),
    FA_YAHOO("fa-yahoo", '\uf19e'),
    FA_YC("fa-yc", '\uf23b'),
    FA_YELP("fa-yelp", '\uf1e9'),
    FA_YEN("fa-yen", '\uf157'),
    FA_YOUTUBE("fa-youtube", '\uf167'),
    FA_YOUTUBE_PLAY("fa-youtube-play", '\uf16a'),
    FA_YOUTUBE_SQUARE("fa-youtube-square", '\uf166'),
    FA_Y_COMBINATOR("fa-y-combinator", '\uf23b');

    private static final String ERROR_DESCRIPTION_BLANK = "Argument 'description' must not be blank";

    public static FontAwesome findByDescription(@Nonnull String description) {
        requireNonBlank(description, "Icon description must not be blank.");
        String[] parts = description.split(":");
        for (FontAwesome font : values()) {
            if (font.getDescription().equals(parts[0])) {
                return font;
            }
        }
        throw new IllegalArgumentException("Icon description '" + description + "' is invalid!");
    }

    private String description;
    private char code;

    FontAwesome(@Nonnull String description, char code) {
        this.description = description;
        this.code = code;
    }

    @Nonnull
    public String getDescription() {
        return description;
    }

    public char getCode() {
        return code;
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid FontAwesome icon description");
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description, Exception e) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid FontAwesome icon description", e);
    }
}