package jf;

import com.dena.mirrorman.net.api.response.UniqueEmomoGiftPreset;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class u0 implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final List<UniqueEmomoGiftPreset> f38015w;

    public u0(List<UniqueEmomoGiftPreset> list) {
        jo.p.h(list, "presets");
        this.f38015w = list;
    }

    public final List<UniqueEmomoGiftPreset> a() {
        return this.f38015w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && jo.p.c(this.f38015w, ((u0) obj).f38015w);
    }

    public int hashCode() {
        return this.f38015w.hashCode();
    }

    public String toString() {
        return "UniqueEmomoRichGiftCreationInfo(presets=" + this.f38015w + ')';
    }
}
