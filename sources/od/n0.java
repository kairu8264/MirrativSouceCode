package od;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.ThumbnailUtils;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.customview.GroupShotMemberSettingView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.FeverValue;
import com.dena.mirrorman.net.api.response.GiftGachaStock;
import com.dena.mirrorman.net.api.response.GiftGachaUserStocksResponse;
import com.dena.mirrorman.net.api.response.GroupShotBackground;
import com.dena.mirrorman.net.api.response.GroupShotBackgroundsResponse;
import com.dena.mirrorman.net.api.response.GroupShotViewer;
import com.dena.mirrorman.net.api.response.SimpleGiftGachaStock;
import com.dena.mirrorman.net.api.response.ViewerAvatarsResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMatchingResponse;
import com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser;
import com.dena.mirrorman.net.bcsvr.response.EventFeverState;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.unity.UnityAnimation;
import com.dena.mirrorman.unity.UnityManager;
import com.dena.mirrorman.unity.UnityScreenshot;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pd.b1;
import pd.c;
import uo.l0;
import uo.y0;

/* loaded from: classes2.dex */
public final class n0 implements uo.q0 {
    public static final a D = new a(null);
    public static final int E = 8;
    public final hf.y A;
    public final /* synthetic */ uo.q0 B;
    public final Paint C;

    /* renamed from: w  reason: collision with root package name */
    public final MRRequest f45064w;

    /* renamed from: x  reason: collision with root package name */
    public final kf.m f45065x;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f45066y;

    /* renamed from: z  reason: collision with root package name */
    public final hf.k0 f45067z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ao.a implements uo.l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n0 f45068w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.a aVar, n0 n0Var) {
            super(aVar);
            this.f45068w = n0Var;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            this.f45068w.f45066y.a(new b1.d(MRError.Network.INSTANCE));
            g9.a.c(th2);
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.StreamEmomoActionCreator$fetchGroupShotAssets$2", f = "StreamEmomoActionCreator.kt", l = {104, 105}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ int B;
        public final /* synthetic */ String C;

        /* renamed from: w  reason: collision with root package name */
        public int f45069w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f45070x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Bitmap f45071y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ n0 f45072z;

        @co.f(c = "com.dena.mirrorman.actioncreator.StreamEmomoActionCreator$fetchGroupShotAssets$2$backgroundImageFileJob$1", f = "StreamEmomoActionCreator.kt", l = {93}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super File>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f45073w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ n0 f45074x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ Bitmap f45075y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n0 n0Var, Bitmap bitmap, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f45074x = n0Var;
                this.f45075y = bitmap;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f45074x, this.f45075y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super File> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f45073w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.k0 k0Var = this.f45074x.f45067z;
                    Bitmap bitmap = this.f45075y;
                    this.f45073w = 1;
                    obj = k0Var.a("group_shot_background", bitmap, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrorman.actioncreator.StreamEmomoActionCreator$fetchGroupShotAssets$2$getViewersJob$1", f = "StreamEmomoActionCreator.kt", l = {101}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super ViewerAvatarsResponse>, Object> {
            public final /* synthetic */ String A;

            /* renamed from: w  reason: collision with root package name */
            public int f45076w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ n0 f45077x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f45078y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f45079z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n0 n0Var, String str, int i10, String str2, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f45077x = n0Var;
                this.f45078y = str;
                this.f45079z = i10;
                this.A = str2;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f45077x, this.f45078y, this.f45079z, this.A, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super ViewerAvatarsResponse> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f45076w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f45077x.f45064w;
                    String b10 = this.f45077x.f45065x.b();
                    String str = this.f45078y;
                    int i11 = this.f45079z;
                    String str2 = this.A;
                    this.f45076w = 1;
                    obj = mRRequest.getViewerAvatars(Referer.BROADCAST_AVATAR, b10, str, i11, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bitmap bitmap, n0 n0Var, String str, int i10, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45071y = bitmap;
            this.f45072z = n0Var;
            this.A = str;
            this.B = i10;
            this.C = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.f45071y, this.f45072z, this.A, this.B, this.C, dVar);
            cVar.f45070x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0 b10;
            y0 b11;
            ViewerAvatarsResponse viewerAvatarsResponse;
            Object c10 = bo.c.c();
            int i10 = this.f45069w;
            try {
            } catch (Throwable th2) {
                this.f45072z.f45066y.a(new b1.d(MRErrorKt.convertMRException(th2).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                uo.q0 q0Var = (uo.q0) this.f45070x;
                Bitmap bitmap = this.f45071y;
                if (bitmap != null) {
                    b10 = uo.l.b(q0Var, null, null, new a(this.f45072z, bitmap, null), 3, null);
                    b11 = uo.l.b(q0Var, null, null, new b(this.f45072z, this.A, this.B, this.C, null), 3, null);
                    this.f45070x = b10;
                    this.f45069w = 1;
                    obj = b11.o(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else {
                    return wn.v.f59242a;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    viewerAvatarsResponse = (ViewerAvatarsResponse) this.f45070x;
                    wn.m.b(obj);
                    this.f45072z.f45066y.a(new b1.f(viewerAvatarsResponse.getViewers(), (File) obj));
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                b10 = (y0) this.f45070x;
                wn.m.b(obj);
            }
            ViewerAvatarsResponse viewerAvatarsResponse2 = (ViewerAvatarsResponse) obj;
            this.f45070x = viewerAvatarsResponse2;
            this.f45069w = 2;
            Object o10 = b10.o(this);
            if (o10 == c10) {
                return c10;
            }
            viewerAvatarsResponse = viewerAvatarsResponse2;
            obj = o10;
            this.f45072z.f45066y.a(new b1.f(viewerAvatarsResponse.getViewers(), (File) obj));
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.StreamEmomoActionCreator$fetchShooterMatchingState$1", f = "StreamEmomoActionCreator.kt", l = {249}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45080w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45080w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = n0.this.f45064w;
                    this.f45080w = 1;
                    obj = mRRequest.getShooterMatching(Referer.BROADCAST_AVATAR, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                n0.this.f45066y.a(new b1.n(((ShooterMatchingResponse) obj).isMatchingEnabled()));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.StreamEmomoActionCreator$getEventNotice$1", f = "StreamEmomoActionCreator.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45082w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45082w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = n0.this.f45064w;
                    this.f45082w = 1;
                    obj = MRRequest.DefaultImpls.getEventNotice$default(mRRequest, 1, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                n0.this.f45066y.a(new b1.b((EventNoticeResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.StreamEmomoActionCreator$loadGiftGachaStocks$1", f = "StreamEmomoActionCreator.kt", l = {225}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45084w;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            GiftGachaUserStocksResponse giftGachaUserStocksResponse;
            Object c10 = bo.c.c();
            int i10 = this.f45084w;
            boolean z10 = true;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = n0.this.f45064w;
                    String b10 = n0.this.f45065x.b();
                    this.f45084w = 1;
                    obj = mRRequest.getGiftGachaUserStocks(Referer.BROADCAST_AVATAR, b10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                giftGachaUserStocksResponse = (GiftGachaUserStocksResponse) obj;
            } catch (Throwable unused) {
            }
            if (giftGachaUserStocksResponse.getEnabled()) {
                n0.this.f45066y.a(new c.j0(3));
                q8.a aVar = n0.this.f45066y;
                List<GiftGachaStock> giftGachaStocks = giftGachaUserStocksResponse.getGiftGachaStocks();
                ArrayList arrayList = new ArrayList(xn.t.u(giftGachaStocks, 10));
                for (GiftGachaStock giftGachaStock : giftGachaStocks) {
                    arrayList.add(SimpleGiftGachaStock.Companion.convert(giftGachaStock));
                }
                aVar.a(new c.k(arrayList));
                n0.this.f45066y.a(new c.r0(FeverValue.Companion.convert(giftGachaUserStocksResponse)));
                q8.a aVar2 = n0.this.f45066y;
                if (giftGachaUserStocksResponse.getEndsAt() <= System.currentTimeMillis() / 1000) {
                    z10 = false;
                }
                aVar2.a(new c.t(new EventFeverState(z10, giftGachaUserStocksResponse.getEndsAt())));
                return wn.v.f59242a;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.StreamEmomoActionCreator$reloadGroupShotBackgrounds$1", f = "StreamEmomoActionCreator.kt", l = {64}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45086w;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45086w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = n0.this.f45064w;
                    this.f45086w = 1;
                    obj = mRRequest.getGroupShotBackgrounds(Referer.BROADCAST_AVATAR, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                n0.this.f45066y.a(new b1.g((GroupShotBackgroundsResponse) obj));
            } catch (Throwable th2) {
                n0.this.f45066y.a(new b1.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.StreamEmomoActionCreator$shareGroupShotBitmap$1", f = "StreamEmomoActionCreator.kt", l = {182}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45088w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Bitmap f45090y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Bitmap bitmap, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f45090y = bitmap;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f45090y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45088w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.k0 k0Var = n0.this.f45067z;
                    Bitmap bitmap = this.f45090y;
                    this.f45088w = 1;
                    obj = k0Var.a("group_shot_snap", bitmap, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                n0.this.f45066y.a(new b1.m(n0.this.A.a((File) obj)));
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.StreamEmomoActionCreator$snapGroupShot$1", f = "StreamEmomoActionCreator.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45091w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ UnityScreenshot f45092x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45093y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ n0 f45094z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(UnityScreenshot unityScreenshot, String str, n0 n0Var, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f45092x = unityScreenshot;
            this.f45093y = str;
            this.f45094z = n0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f45092x, this.f45093y, this.f45094z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f45091w == 0) {
                wn.m.b(obj);
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(this.f45092x.getImagePath());
                    try {
                        new File(this.f45092x.getImagePath()).delete();
                    } catch (IOException unused) {
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(762, 1113, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawBitmap(ThumbnailUtils.extractThumbnail(BitmapFactory.decodeFile(this.f45093y), 762, 1113), 0.0f, 0.0f, this.f45094z.C);
                    canvas.drawBitmap(ThumbnailUtils.extractThumbnail(decodeFile, 762, 1113), 0.0f, 0.0f, this.f45094z.C);
                    q8.a aVar = this.f45094z.f45066y;
                    jo.p.g(createBitmap, "groupShotImage");
                    aVar.a(new b1.o(createBitmap));
                } catch (Throwable unused2) {
                }
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.StreamEmomoActionCreator$thumbnailGroupShot$1", f = "StreamEmomoActionCreator.kt", l = {195}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45095w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Bitmap f45097y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Bitmap bitmap, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f45097y = bitmap;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f45097y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45095w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.k0 k0Var = n0.this.f45067z;
                    Bitmap bitmap = this.f45097y;
                    this.f45095w = 1;
                    obj = k0Var.a("group_shot_snap", bitmap, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                n0.this.f45066y.a(new b1.p(n0.this.A.a((File) obj)));
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return wn.v.f59242a;
        }
    }

    public n0(MRRequest mRRequest, kf.m mVar, q8.a aVar, hf.k0 k0Var, hf.y yVar) {
        jo.p.h(mRRequest, "request");
        jo.p.h(mVar, "livePreference");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(k0Var, "saveImageToLocalStorage");
        jo.p.h(yVar, "getUriFromFile");
        this.f45064w = mRRequest;
        this.f45065x = mVar;
        this.f45066y = aVar;
        this.f45067z = k0Var;
        this.A = yVar;
        this.B = uo.r0.b();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.C = paint;
    }

    public final void g(String str, int i10, Bitmap bitmap, String str2) {
        jo.p.h(str, "memberType");
        this.f45066y.a(b1.i.f46616a);
        uo.l.d(this, new b(uo.l0.f56050r, this), null, new c(bitmap, this, str, i10, str2, null), 2, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B.getCoroutineContext();
    }

    public final void h() {
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final void i(List<GroupShotViewer> list) {
        int i10 = 0;
        UnityManager.setAnimation$default(UnityManager.Companion.getInstance(), UnityAnimation.POSE_RESET, 0, 2, null);
        if (list != null) {
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    xn.s.t();
                }
                GroupShotViewer groupShotViewer = (GroupShotViewer) obj;
                UnityManager.Companion.getInstance().unloadAvatarModel(i11);
                i10 = i11;
            }
        }
        UnityManager.Companion companion = UnityManager.Companion;
        companion.getInstance().restoreCameraDolly();
        companion.getInstance().getCollabAvatarManager().restartCollabMode();
        companion.getInstance().setGroupOrder("0");
        companion.getInstance().setCollabo001();
        this.f45066y.a(b1.a.f46607a);
    }

    public final void j() {
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    public final void k(int i10) {
        this.f45066y.a(new b1.c(i10));
    }

    public final void l() {
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    public final void m(List<GroupShotBackground> list) {
        jo.p.h(list, "cachedBackgrounds");
        if (!list.isEmpty()) {
            this.f45066y.a(new b1.h(list));
            return;
        }
        this.f45066y.a(b1.j.f46617a);
        uo.l.d(this, null, null, new g(null), 3, null);
    }

    public final void n(String str) {
        jo.p.h(str, "backgroundImageUrl");
        this.f45066y.a(new b1.k(str));
    }

    public final void o(Bitmap bitmap) {
        jo.p.h(bitmap, "image");
        this.f45066y.a(new b1.l(bitmap));
    }

    public final void p(Bitmap bitmap) {
        jo.p.h(bitmap, "bitmap");
        uo.l.d(this, null, null, new h(bitmap, null), 3, null);
    }

    public final void q(UnityScreenshot unityScreenshot, String str, String str2) {
        jo.p.h(unityScreenshot, "screenshot");
        jo.p.h(str, "backgroundImagePath");
        jo.p.h(str2, "emomoImagePath");
        uo.l.d(this, null, null, new i(unityScreenshot, str, this, null), 3, null);
    }

    public final void r(Bitmap bitmap) {
        jo.p.h(bitmap, "bitmap");
        uo.l.d(this, null, null, new j(bitmap, null), 3, null);
    }

    public final void s(List<LiveGiftRankingUser> list) {
        jo.p.h(list, "members");
        this.f45066y.a(new b1.s(list));
    }

    public final void t(int i10) {
        this.f45066y.a(new b1.r(i10));
    }

    public final void u(GroupShotMemberSettingView.b bVar) {
        jo.p.h(bVar, "selectedMemberType");
        this.f45066y.a(new b1.q(bVar));
    }

    public final void v(boolean z10) {
        this.f45066y.a(new b1.n(z10));
    }
}
