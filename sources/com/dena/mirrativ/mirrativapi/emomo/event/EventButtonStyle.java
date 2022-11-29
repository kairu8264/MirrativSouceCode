package com.dena.mirrativ.mirrativapi.emomo.event;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class EventButtonStyle implements Serializable {
    private final String backgroundColor;
    private final String frameColor;
    private final String textColor;

    public EventButtonStyle(String str, String str2, String str3) {
        p.h(str, TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
        p.h(str2, "frameColor");
        p.h(str3, "textColor");
        this.backgroundColor = str;
        this.frameColor = str2;
        this.textColor = str3;
    }

    public static /* synthetic */ EventButtonStyle copy$default(EventButtonStyle eventButtonStyle, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventButtonStyle.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            str2 = eventButtonStyle.frameColor;
        }
        if ((i10 & 4) != 0) {
            str3 = eventButtonStyle.textColor;
        }
        return eventButtonStyle.copy(str, str2, str3);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.frameColor;
    }

    public final String component3() {
        return this.textColor;
    }

    public final EventButtonStyle copy(String str, String str2, String str3) {
        p.h(str, TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
        p.h(str2, "frameColor");
        p.h(str3, "textColor");
        return new EventButtonStyle(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EventButtonStyle) {
            EventButtonStyle eventButtonStyle = (EventButtonStyle) obj;
            return p.c(this.backgroundColor, eventButtonStyle.backgroundColor) && p.c(this.frameColor, eventButtonStyle.frameColor) && p.c(this.textColor, eventButtonStyle.textColor);
        }
        return false;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getFrameColor() {
        return this.frameColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return (((this.backgroundColor.hashCode() * 31) + this.frameColor.hashCode()) * 31) + this.textColor.hashCode();
    }

    public String toString() {
        return "EventButtonStyle(backgroundColor=" + this.backgroundColor + ", frameColor=" + this.frameColor + ", textColor=" + this.textColor + ')';
    }
}
