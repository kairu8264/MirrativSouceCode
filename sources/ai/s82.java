package ai;

import android.os.Bundle;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;

/* loaded from: classes3.dex */
public final class s82 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final int f9757a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9758b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9759c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9760d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9761e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9762f;

    /* renamed from: g  reason: collision with root package name */
    public final float f9763g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9764h;

    public s82(int i10, boolean z10, boolean z11, int i11, int i12, int i13, float f10, boolean z12) {
        this.f9757a = i10;
        this.f9758b = z10;
        this.f9759c = z11;
        this.f9760d = i11;
        this.f9761e = i12;
        this.f9762f = i13;
        this.f9763g = f10;
        this.f9764h = z12;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt(TopicConstant.PACKET_TYPE_AUDIO_MP3, this.f9757a);
        bundle2.putBoolean("ma", this.f9758b);
        bundle2.putBoolean("sp", this.f9759c);
        bundle2.putInt("muv", this.f9760d);
        bundle2.putInt("rm", this.f9761e);
        bundle2.putInt("riv", this.f9762f);
        bundle2.putFloat("android_app_volume", this.f9763g);
        bundle2.putBoolean("android_app_muted", this.f9764h);
    }
}
