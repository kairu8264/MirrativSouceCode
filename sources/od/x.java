package od;

import android.net.Uri;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.live.LiveCaptureImageResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import ep.y;
import java.io.File;
import pd.h0;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class x implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45353w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f45354x;

    /* renamed from: y  reason: collision with root package name */
    public final kf.x f45355y;

    /* renamed from: z  reason: collision with root package name */
    public final ao.g f45356z;

    @co.f(c = "com.dena.mirrorman.actioncreator.LiveThumbnailSettingActionCreator$deleteLiveThumbnail$1", f = "LiveThumbnailSettingActionCreator.kt", l = {58}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45357w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45359y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45360z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f45359y = str;
            this.f45360z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45359y, this.f45360z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45357w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    x.this.f45353w.a(h0.c.f46908a);
                    ep.y e10 = new y.a(null, 1, null).f(ep.y.f31045k).a(MRLog.PAYLOAD_KEY_LIVE_ID, this.f45359y).a("live_capture_image", "").e();
                    MRRequest mRRequest = x.this.f45354x;
                    String str = this.f45360z;
                    this.f45357w = 1;
                    obj = mRRequest.postLiveCaptureImage(str, e10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                LiveCaptureImageResponse liveCaptureImageResponse = (LiveCaptureImageResponse) obj;
                x.this.f45355y.R2(liveCaptureImageResponse.getImageUrl());
                x.this.f45353w.a(new h0.b(liveCaptureImageResponse.getImageUrl()));
            } catch (Exception e11) {
                x.this.f45353w.a(new h0.a(MRErrorKt.convertMRException(e11).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.LiveThumbnailSettingActionCreator$updateLiveThumbnail$1", f = "LiveThumbnailSettingActionCreator.kt", l = {39}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f45361w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Uri f45363y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45364z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri, String str, String str2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45363y = uri;
            this.f45364z = str;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45363y, this.f45364z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45361w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    x.this.f45353w.a(h0.c.f46908a);
                    ep.y e10 = new y.a(null, 1, null).f(ep.y.f31045k).a(MRLog.PAYLOAD_KEY_LIVE_ID, this.f45364z).b("live_capture_image", "live_capture_image", ep.c0.f30798a.c(new File(this.f45363y.getPath()), ep.x.f31036g.b(MimeTypes.IMAGE_JPEG))).a("is_default_live_thumbnail", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).e();
                    MRRequest mRRequest = x.this.f45354x;
                    String str = this.A;
                    this.f45361w = 1;
                    obj = mRRequest.postLiveCaptureImage(str, e10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                LiveCaptureImageResponse liveCaptureImageResponse = (LiveCaptureImageResponse) obj;
                x.this.f45355y.R2(liveCaptureImageResponse.getImageUrl());
                x.this.f45353w.a(new h0.b(liveCaptureImageResponse.getImageUrl()));
            } catch (Exception e11) {
                x.this.f45353w.a(new h0.a(MRErrorKt.convertMRException(e11).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public x(q8.a aVar, MRRequest mRRequest, kf.x xVar) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(xVar, "userPreference");
        this.f45353w = aVar;
        this.f45354x = mRRequest;
        this.f45355y = xVar;
        uo.k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.f45356z = b11.plus(b10);
    }

    public final void d(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        uo.l.d(this, null, null, new a(str2, str, null), 3, null);
    }

    public final void e(String str, String str2, Uri uri) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        jo.p.h(uri, "imageUri");
        uo.l.d(this, null, null, new b(uri, str2, str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45356z;
    }
}
