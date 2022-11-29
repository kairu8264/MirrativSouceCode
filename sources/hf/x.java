package hf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import wn.l;

/* loaded from: classes2.dex */
public final class x implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Context f35623a;

    /* loaded from: classes2.dex */
    public static final class a extends f8.c<Bitmap> {
        public final /* synthetic */ String A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ao.d<Bitmap> f35624z;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ao.d<? super Bitmap> dVar, String str) {
            this.f35624z = dVar;
            this.A = str;
        }

        @Override // f8.j
        /* renamed from: a */
        public void e(Bitmap bitmap, g8.b<? super Bitmap> bVar) {
            jo.p.h(bitmap, "resource");
            try {
                ao.d<Bitmap> dVar = this.f35624z;
                l.a aVar = wn.l.f59224w;
                dVar.resumeWith(wn.l.a(bitmap));
            } catch (IllegalStateException e10) {
                g9.a.c(e10);
            }
        }

        @Override // f8.j
        public void g(Drawable drawable) {
        }

        @Override // f8.c, f8.j
        public void k(Drawable drawable) {
            g9.a aVar = g9.a.f32826a;
            aVar.b("image load error url = " + this.A, new Object[0]);
            try {
                ao.d<Bitmap> dVar = this.f35624z;
                l.a aVar2 = wn.l.f59224w;
                dVar.resumeWith(wn.l.a(null));
            } catch (IllegalStateException e10) {
                g9.a.c(e10);
            }
        }
    }

    public x(Context context) {
        jo.p.h(context, "context");
        this.f35623a = context;
    }

    @Override // hf.w
    public Object execute(String str, ao.d<? super Bitmap> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        GlideApp.with(this.f35623a).asBitmap().load(str).into((GlideRequest<Bitmap>) new a(iVar, str));
        Object a10 = iVar.a();
        if (a10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a10;
    }
}
