package ce;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.LiveArchiveStatus;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import jo.f0;
import nd.f1;
import nd.i1;
import oq.a;
import tb.c;

/* loaded from: classes2.dex */
public final class x implements oq.a {
    public static final a B = new a(null);
    public static final int C = 8;
    public static long D;
    public final wn.f A;

    /* renamed from: w  reason: collision with root package name */
    public final Context f19486w;

    /* renamed from: x  reason: collision with root package name */
    public final io.l<Intent, wn.v> f19487x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f19488y;

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f19489z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f19490w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19491x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19492y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f19490w = aVar;
            this.f19491x = aVar2;
            this.f19492y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            xq.a b10;
            oq.a aVar = this.f19490w;
            vq.a aVar2 = this.f19491x;
            io.a<? extends uq.a> aVar3 = this.f19492y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(i1.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f19493w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19494x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19495y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f19493w = aVar;
            this.f19494x = aVar2;
            this.f19495y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            xq.a b10;
            oq.a aVar = this.f19493w;
            vq.a aVar2 = this.f19494x;
            io.a<? extends uq.a> aVar3 = this.f19495y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(kf.x.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f19496w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19497x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19498y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f19496w = aVar;
            this.f19497x = aVar2;
            this.f19498y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            xq.a b10;
            oq.a aVar = this.f19496w;
            vq.a aVar2 = this.f19497x;
            io.a<? extends uq.a> aVar3 = this.f19498y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(tb.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(Context context, io.l<? super Intent, wn.v> lVar) {
        jo.p.h(context, "context");
        jo.p.h(lVar, "handlePlayerIntentListener");
        this.f19486w = context;
        this.f19487x = lVar;
        cr.a aVar = cr.a.f28611a;
        this.f19488y = wn.g.b(aVar.b(), new b(this, null, null));
        this.f19489z = wn.g.b(aVar.b(), new c(this, null, null));
        this.A = wn.g.b(aVar.b(), new d(this, null, null));
    }

    public final void a(LiveBasicParams liveBasicParams, String str) {
        jo.p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        jo.p.h(str, "referer");
        if (c().a().g()) {
            Toast.makeText(this.f19486w, f1.f41998x0, 0).show();
        } else if (liveBasicParams.isLive()) {
            if (System.currentTimeMillis() - D < PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS) {
                Toast.makeText(this.f19486w, f1.f41975i, 0).show();
                return;
            }
            D = System.currentTimeMillis();
            Intent f10 = c.a.f(b(), this.f19486w, liveBasicParams.getLiveId(), str, liveBasicParams.getJoinedLiveThumbnailImageUrl(), liveBasicParams.getOrientationV2(), false, false, false, false, null, 960, null);
            f10.addFlags(67108864);
            this.f19487x.invoke(f10);
        } else if (!liveBasicParams.isArchive() && (!jo.p.c(d().T4(), liveBasicParams.getOwner().getUserId()) || liveBasicParams.getArchiveStatus() != LiveArchiveStatus.PREPARED)) {
            if (!liveBasicParams.isLive() && !liveBasicParams.isArchive() && !jo.p.c(d().T4(), liveBasicParams.getOwner().getUserId())) {
                io.l<Intent, wn.v> lVar = this.f19487x;
                tb.c b10 = b();
                Context context = this.f19486w;
                Intent intent = new Intent("actiontype_dialog_afterplay");
                intent.putExtra("EXTRA_LIVE_REQUEST", new oe.a(liveBasicParams.getLiveId(), liveBasicParams.getOwner().getUserId(), false, true, 0L, "", null));
                intent.putExtra("EXTRA_SHOULD_SHOW_LIVE_REQUEST", true);
                wn.v vVar = wn.v.f59242a;
                lVar.invoke(b10.x(context, str, intent));
                return;
            }
            Toast.makeText(this.f19486w, f1.f41975i, 0).show();
        } else if (c().a().d()) {
            Toast.makeText(this.f19486w, f1.f41998x0, 0).show();
        } else if (System.currentTimeMillis() - D < PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS) {
            Toast.makeText(this.f19486w, f1.f41975i, 0).show();
        } else {
            D = System.currentTimeMillis();
            this.f19487x.invoke(b().w0(this.f19486w, liveBasicParams.getLiveId()));
        }
    }

    public final tb.c b() {
        return (tb.c) this.A.getValue();
    }

    public final i1 c() {
        return (i1) this.f19488y.getValue();
    }

    public final kf.x d() {
        return (kf.x) this.f19489z.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
