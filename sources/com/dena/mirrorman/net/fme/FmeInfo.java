package com.dena.mirrorman.net.fme;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class FmeInfo {
    public static final int $stable = 8;
    private final String artists;
    private final String artistsReading;
    private final String author;
    private final String composer;
    private final String jasracCode;
    private final List<Boolean> rhythmTracks;
    private final String songTitle;
    private final String songTitleReading;
    private final int songTotalTime;
    private final SongType songType;
    private final String startLyrics;
    private final List<Boolean> vocalTracks;

    public FmeInfo(SongType songType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, List<Boolean> list, List<Boolean> list2) {
        p.h(songType, "songType");
        p.h(str, "songTitle");
        p.h(str2, "artists");
        p.h(str3, "author");
        p.h(str4, "composer");
        p.h(str5, "songTitleReading");
        p.h(str6, "artistsReading");
        p.h(str7, "jasracCode");
        p.h(str8, "startLyrics");
        p.h(list, "vocalTracks");
        p.h(list2, "rhythmTracks");
        this.songType = songType;
        this.songTitle = str;
        this.artists = str2;
        this.author = str3;
        this.composer = str4;
        this.songTitleReading = str5;
        this.artistsReading = str6;
        this.jasracCode = str7;
        this.startLyrics = str8;
        this.songTotalTime = i10;
        this.vocalTracks = list;
        this.rhythmTracks = list2;
    }

    public final SongType component1() {
        return this.songType;
    }

    public final int component10() {
        return this.songTotalTime;
    }

    public final List<Boolean> component11() {
        return this.vocalTracks;
    }

    public final List<Boolean> component12() {
        return this.rhythmTracks;
    }

    public final String component2() {
        return this.songTitle;
    }

    public final String component3() {
        return this.artists;
    }

    public final String component4() {
        return this.author;
    }

    public final String component5() {
        return this.composer;
    }

    public final String component6() {
        return this.songTitleReading;
    }

    public final String component7() {
        return this.artistsReading;
    }

    public final String component8() {
        return this.jasracCode;
    }

    public final String component9() {
        return this.startLyrics;
    }

    public final FmeInfo copy(SongType songType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, List<Boolean> list, List<Boolean> list2) {
        p.h(songType, "songType");
        p.h(str, "songTitle");
        p.h(str2, "artists");
        p.h(str3, "author");
        p.h(str4, "composer");
        p.h(str5, "songTitleReading");
        p.h(str6, "artistsReading");
        p.h(str7, "jasracCode");
        p.h(str8, "startLyrics");
        p.h(list, "vocalTracks");
        p.h(list2, "rhythmTracks");
        return new FmeInfo(songType, str, str2, str3, str4, str5, str6, str7, str8, i10, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FmeInfo) {
            FmeInfo fmeInfo = (FmeInfo) obj;
            return this.songType == fmeInfo.songType && p.c(this.songTitle, fmeInfo.songTitle) && p.c(this.artists, fmeInfo.artists) && p.c(this.author, fmeInfo.author) && p.c(this.composer, fmeInfo.composer) && p.c(this.songTitleReading, fmeInfo.songTitleReading) && p.c(this.artistsReading, fmeInfo.artistsReading) && p.c(this.jasracCode, fmeInfo.jasracCode) && p.c(this.startLyrics, fmeInfo.startLyrics) && this.songTotalTime == fmeInfo.songTotalTime && p.c(this.vocalTracks, fmeInfo.vocalTracks) && p.c(this.rhythmTracks, fmeInfo.rhythmTracks);
        }
        return false;
    }

    public final String getArtists() {
        return this.artists;
    }

    public final String getArtistsReading() {
        return this.artistsReading;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getComposer() {
        return this.composer;
    }

    public final String getJasracCode() {
        return this.jasracCode;
    }

    public final List<Boolean> getRhythmTracks() {
        return this.rhythmTracks;
    }

    public final String getSongTitle() {
        return this.songTitle;
    }

    public final String getSongTitleReading() {
        return this.songTitleReading;
    }

    public final int getSongTotalTime() {
        return this.songTotalTime;
    }

    public final SongType getSongType() {
        return this.songType;
    }

    public final String getStartLyrics() {
        return this.startLyrics;
    }

    public final List<Boolean> getVocalTracks() {
        return this.vocalTracks;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.songType.hashCode() * 31) + this.songTitle.hashCode()) * 31) + this.artists.hashCode()) * 31) + this.author.hashCode()) * 31) + this.composer.hashCode()) * 31) + this.songTitleReading.hashCode()) * 31) + this.artistsReading.hashCode()) * 31) + this.jasracCode.hashCode()) * 31) + this.startLyrics.hashCode()) * 31) + Integer.hashCode(this.songTotalTime)) * 31) + this.vocalTracks.hashCode()) * 31) + this.rhythmTracks.hashCode();
    }

    public String toString() {
        return "FmeInfo(songType=" + this.songType + ", songTitle=" + this.songTitle + ", artists=" + this.artists + ", author=" + this.author + ", composer=" + this.composer + ", songTitleReading=" + this.songTitleReading + ", artistsReading=" + this.artistsReading + ", jasracCode=" + this.jasracCode + ", startLyrics=" + this.startLyrics + ", songTotalTime=" + this.songTotalTime + ", vocalTracks=" + this.vocalTracks + ", rhythmTracks=" + this.rhythmTracks + ')';
    }
}
