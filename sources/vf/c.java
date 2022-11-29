package vf;

import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.widget.ListPopupWindow;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import rg.g;

@Deprecated
/* loaded from: classes3.dex */
public final class c {
    @RecentlyNonNull

    /* renamed from: b  reason: collision with root package name */
    public static final c f57307b = new c(-1, -2, "mb");
    @RecentlyNonNull

    /* renamed from: c  reason: collision with root package name */
    public static final c f57308c = new c(320, 50, "mb");
    @RecentlyNonNull

    /* renamed from: d  reason: collision with root package name */
    public static final c f57309d = new c(300, ListPopupWindow.EXPAND_LIST_TIMEOUT, TopicConstant.PACKET_TYPE_AUDIO_SPEEX);
    @RecentlyNonNull

    /* renamed from: e  reason: collision with root package name */
    public static final c f57310e = new c(468, 60, TopicConstant.PACKET_TYPE_AUDIO_SPEEX);
    @RecentlyNonNull

    /* renamed from: f  reason: collision with root package name */
    public static final c f57311f = new c(728, 90, TopicConstant.PACKET_TYPE_AUDIO_SPEEX);
    @RecentlyNonNull

    /* renamed from: g  reason: collision with root package name */
    public static final c f57312g = new c(160, 600, TopicConstant.PACKET_TYPE_AUDIO_SPEEX);

    /* renamed from: a  reason: collision with root package name */
    public final g f57313a;

    public c(int i10, int i11, String str) {
        this(new g(i10, i11));
    }

    public c(@RecentlyNonNull g gVar) {
        this.f57313a = gVar;
    }

    public int a() {
        return this.f57313a.a();
    }

    public int b() {
        return this.f57313a.c();
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (obj instanceof c) {
            return this.f57313a.equals(((c) obj).f57313a);
        }
        return false;
    }

    public int hashCode() {
        return this.f57313a.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f57313a.toString();
    }
}
