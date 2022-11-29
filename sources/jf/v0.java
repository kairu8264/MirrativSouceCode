package jf;

import com.dena.mirrorman.net.api.response.UniqueEmomoGiftColorConfig;
import com.dena.mirrorman.unity.UnityScreenshot;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class v0 implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final List<UniqueEmomoGiftColorConfig> f38020w;

    /* renamed from: x  reason: collision with root package name */
    public final UnityScreenshot f38021x;

    public v0(List<UniqueEmomoGiftColorConfig> list, UnityScreenshot unityScreenshot) {
        jo.p.h(list, "colors");
        jo.p.h(unityScreenshot, "screenshot");
        this.f38020w = list;
        this.f38021x = unityScreenshot;
    }

    public final List<UniqueEmomoGiftColorConfig> a() {
        return this.f38020w;
    }

    public final UnityScreenshot b() {
        return this.f38021x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            return jo.p.c(this.f38020w, v0Var.f38020w) && jo.p.c(this.f38021x, v0Var.f38021x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f38020w.hashCode() * 31) + this.f38021x.hashCode();
    }

    public String toString() {
        return "UniqueEmomoStampGiftCreationInfo(colors=" + this.f38020w + ", screenshot=" + this.f38021x + ')';
    }
}
