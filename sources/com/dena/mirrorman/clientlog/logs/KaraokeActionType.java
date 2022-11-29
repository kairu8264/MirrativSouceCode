package com.dena.mirrorman.clientlog.logs;

/* loaded from: classes2.dex */
public enum KaraokeActionType {
    CLOSE_SONG_LIST("karaoke.close_song_list"),
    SING_END("karaoke.sing_end"),
    OPEN_CATEGORY_PAGE("karaoke.open_category_page"),
    SELECT_LIST_TAB("karaoke.select_song_list_tab"),
    OPEN_SINGER_PAGE("karaoke.open_singer_page"),
    OPEN_SEARCH_PAGE("karaoke.open_search_page");
    
    private final String rawValue;

    KaraokeActionType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
