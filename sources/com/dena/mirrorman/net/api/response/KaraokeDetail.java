package com.dena.mirrorman.net.api.response;

import de.g;
import java.io.Serializable;
import java.util.ArrayList;
import jo.p;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class KaraokeDetail implements Serializable {
    public static final int $stable = 0;
    private final String bgUrl;
    private final float bpm;
    private final String category;
    private final String fmeUrl;

    /* renamed from: id  reason: collision with root package name */
    private final int f26156id;
    private final String introLyrics;
    private final String oggUrl;
    private final int playingTime;
    private final String singerId;
    private final String singerName;
    private final String title;

    public KaraokeDetail(int i10, String str, int i11, float f10, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        p.h(str, "title");
        p.h(str2, "introLyrics");
        p.h(str3, "oggUrl");
        p.h(str4, "fmeUrl");
        p.h(str5, "singerId");
        p.h(str6, "singerName");
        p.h(str7, "category");
        p.h(str8, "bgUrl");
        this.f26156id = i10;
        this.title = str;
        this.playingTime = i11;
        this.bpm = f10;
        this.introLyrics = str2;
        this.oggUrl = str3;
        this.fmeUrl = str4;
        this.singerId = str5;
        this.singerName = str6;
        this.category = str7;
        this.bgUrl = str8;
    }

    public final int component1() {
        return this.f26156id;
    }

    public final String component10() {
        return this.category;
    }

    public final String component11() {
        return this.bgUrl;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.playingTime;
    }

    public final float component4() {
        return this.bpm;
    }

    public final String component5() {
        return this.introLyrics;
    }

    public final String component6() {
        return this.oggUrl;
    }

    public final String component7() {
        return this.fmeUrl;
    }

    public final String component8() {
        return this.singerId;
    }

    public final String component9() {
        return this.singerName;
    }

    public final KaraokeDetail copy(int i10, String str, int i11, float f10, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        p.h(str, "title");
        p.h(str2, "introLyrics");
        p.h(str3, "oggUrl");
        p.h(str4, "fmeUrl");
        p.h(str5, "singerId");
        p.h(str6, "singerName");
        p.h(str7, "category");
        p.h(str8, "bgUrl");
        return new KaraokeDetail(i10, str, i11, f10, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KaraokeDetail) {
            KaraokeDetail karaokeDetail = (KaraokeDetail) obj;
            return this.f26156id == karaokeDetail.f26156id && p.c(this.title, karaokeDetail.title) && this.playingTime == karaokeDetail.playingTime && p.c(Float.valueOf(this.bpm), Float.valueOf(karaokeDetail.bpm)) && p.c(this.introLyrics, karaokeDetail.introLyrics) && p.c(this.oggUrl, karaokeDetail.oggUrl) && p.c(this.fmeUrl, karaokeDetail.fmeUrl) && p.c(this.singerId, karaokeDetail.singerId) && p.c(this.singerName, karaokeDetail.singerName) && p.c(this.category, karaokeDetail.category) && p.c(this.bgUrl, karaokeDetail.bgUrl);
        }
        return false;
    }

    public final String getBgUrl() {
        return this.bgUrl;
    }

    public final float getBpm() {
        return this.bpm;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDisplayTimeString(int i10) {
        return g.d(i10) + " | " + g.d(this.playingTime);
    }

    public final String getFmeUrl() {
        return this.fmeUrl;
    }

    public final int getId() {
        return this.f26156id;
    }

    public final String getIntroLyrics() {
        return this.introLyrics;
    }

    public final String getOggUrl() {
        return this.oggUrl;
    }

    public final int getPlayingTime() {
        return this.playingTime;
    }

    public final String getSingEndLogJson(int i10) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("karaoke_id", this.f26156id);
        jSONObject.put("karaoke_title", this.title);
        jSONObject.put("singer_id", this.singerId);
        jSONObject.put("singer_name", this.singerName);
        jSONObject.put("karaoke_duration", this.playingTime);
        jSONObject.put("remain_karaoke_duration", this.playingTime - i10);
        String jSONObject2 = jSONObject.toString();
        p.g(jSONObject2, "JSONObject().apply {\n   …ime)\n        }.toString()");
        return jSONObject2;
    }

    public final String getSingerId() {
        return this.singerId;
    }

    public final String getSingerName() {
        return this.singerName;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.f26156id) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.playingTime)) * 31) + Float.hashCode(this.bpm)) * 31) + this.introLyrics.hashCode()) * 31) + this.oggUrl.hashCode()) * 31) + this.fmeUrl.hashCode()) * 31) + this.singerId.hashCode()) * 31) + this.singerName.hashCode()) * 31) + this.category.hashCode()) * 31) + this.bgUrl.hashCode();
    }

    public final Karaoke toKaraoke() {
        return new Karaoke(this.f26156id, this.title, this.playingTime, this.singerId, this.singerName, new ArrayList());
    }

    public String toString() {
        return "KaraokeDetail(id=" + this.f26156id + ", title=" + this.title + ", playingTime=" + this.playingTime + ", bpm=" + this.bpm + ", introLyrics=" + this.introLyrics + ", oggUrl=" + this.oggUrl + ", fmeUrl=" + this.fmeUrl + ", singerId=" + this.singerId + ", singerName=" + this.singerName + ", category=" + this.category + ", bgUrl=" + this.bgUrl + ')';
    }
}
