package ai;

import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;

/* loaded from: classes3.dex */
public final class tx0 {

    /* renamed from: a  reason: collision with root package name */
    public final nq2 f10497a;

    /* renamed from: b  reason: collision with root package name */
    public final pp1 f10498b;

    /* renamed from: c  reason: collision with root package name */
    public final sl2 f10499c;

    public tx0(pp1 pp1Var, sl2 sl2Var, nq2 nq2Var) {
        this.f10497a = nq2Var;
        this.f10498b = pp1Var;
        this.f10499c = sl2Var;
    }

    public static String b(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : TopicConstant.PACKET_TYPE_AUDIO_AAC : "cb" : "cc" : "bb" : "h";
    }

    public final void a(long j10, int i10) {
        if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
            nq2 nq2Var = this.f10497a;
            mq2 a10 = mq2.a("ad_closed");
            a10.h(this.f10499c.f9876b.f9497b);
            a10.c("show_time", String.valueOf(j10));
            a10.c("ad_format", "app_open_ad");
            a10.c("acr", b(i10));
            nq2Var.a(a10);
            return;
        }
        op1 d10 = this.f10498b.d();
        d10.b(this.f10499c.f9876b.f9497b);
        d10.d(ActionLogBase.ACTION, "ad_closed");
        d10.d("show_time", String.valueOf(j10));
        d10.d("ad_format", "app_open_ad");
        d10.d("acr", b(i10));
        d10.e();
    }
}
