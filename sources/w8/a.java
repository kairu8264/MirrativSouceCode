package w8;

import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.request.PostGalleryPhotoRequest;
import com.dena.mirrorman.net.api.response.live.PhotoCampaignPostStatusResponse;
import com.dena.mirrorman.net.api.response.live.PhotoCampaignStatusResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import ep.c0;
import io.p;
import java.io.File;
import w8.b;
import wn.m;
import wn.v;

/* loaded from: classes.dex */
public final class a extends q0 implements uo.q0 {
    public final /* synthetic */ da.b A;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f58215y;

    /* renamed from: z  reason: collision with root package name */
    public final MRRequest f58216z;

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostActionCreator$fetchCampaignStatus$1", f = "PhotoCampaignPostActionCreator.kt", l = {22}, m = "invokeSuspend")
    /* renamed from: w8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0957a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58217w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f58219y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0957a(String str, ao.d<? super C0957a> dVar) {
            super(2, dVar);
            this.f58219y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0957a(this.f58219y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((C0957a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58217w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = a.this.f58216z;
                    String str = this.f58219y;
                    this.f58217w = 1;
                    obj = mRRequest.getCurrentPhotoCampaignStatus(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f58215y.a(new b.c(((PhotoCampaignStatusResponse) obj).getPhotoCampaign()));
            } catch (Throwable th2) {
                a.this.f58215y.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostActionCreator$uploadCampaignPhoto$1", f = "PhotoCampaignPostActionCreator.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ a B;
        public final /* synthetic */ String C;

        /* renamed from: w  reason: collision with root package name */
        public int f58220w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f58221x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ File f58222y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f58223z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, File file, String str2, boolean z10, a aVar, String str3, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f58221x = str;
            this.f58222y = file;
            this.f58223z = str2;
            this.A = z10;
            this.B = aVar;
            this.C = str3;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f58221x, this.f58222y, this.f58223z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58220w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    String str = this.f58221x;
                    String absolutePath = this.f58222y.getAbsolutePath();
                    jo.p.g(absolutePath, "photoImageFile.absolutePath");
                    PostGalleryPhotoRequest postGalleryPhotoRequest = new PostGalleryPhotoRequest(str, absolutePath, this.f58223z, this.A);
                    MRRequest mRRequest = this.B.f58216z;
                    String str2 = this.C;
                    c0 build = postGalleryPhotoRequest.build();
                    this.f58220w = 1;
                    obj = mRRequest.postGalleryPhoto(str2, build, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                this.B.f58215y.a(new b.f(((PhotoCampaignPostStatusResponse) obj).getCoinNum()));
            } catch (Throwable th2) {
                this.B.f58215y.a(new b.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f58215y = aVar;
        this.f58216z = mRRequest;
        this.A = new da.b();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final void h(String str) {
        jo.p.h(str, "referer");
        this.f58215y.a(b.C0958b.f58225a);
        uo.l.d(this, null, null, new C0957a(str, null), 3, null);
    }

    public final void i(String str, String str2, File file, String str3, boolean z10) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "campaignId");
        jo.p.h(file, "photoImageFile");
        jo.p.h(str3, "comment");
        this.f58215y.a(b.e.f58229a);
        uo.l.d(this, null, null, new b(str2, file, str3, z10, this, str, null), 3, null);
    }
}
