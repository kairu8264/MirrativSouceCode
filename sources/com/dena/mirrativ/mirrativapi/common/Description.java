package com.dena.mirrativ.mirrativapi.common;

import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class Description implements Serializable {
    private final String text;
    private final String title;

    public Description(String str, String str2) {
        p.h(str, "title");
        p.h(str2, "text");
        this.title = str;
        this.text = str2;
    }

    public static /* synthetic */ Description copy$default(Description description, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = description.title;
        }
        if ((i10 & 2) != 0) {
            str2 = description.text;
        }
        return description.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final Description copy(String str, String str2) {
        p.h(str, "title");
        p.h(str2, "text");
        return new Description(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Description) {
            Description description = (Description) obj;
            return p.c(this.title, description.title) && p.c(this.text, description.text);
        }
        return false;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.text.hashCode();
    }

    public String toString() {
        return "Description(title=" + this.title + ", text=" + this.text + ')';
    }
}
