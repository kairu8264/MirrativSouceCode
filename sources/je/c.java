package je;

import ae.t2;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import be.k5;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.ChooseReceiver;
import com.dena.mirrorman.clientlog.logs.Live;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.unity.UnityScreenshot;
import com.dena.mirrorman.util.FragmentRunner;
import hf.k0;
import hf.v0;
import hf.y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jo.e0;
import jo.f0;
import kq.a;
import nd.b1;
import nd.f1;
import nd.y0;
import org.json.JSONObject;
import uo.g1;
import uo.q0;
import uo.r0;
import uo.v1;

/* loaded from: classes2.dex */
public final class c extends androidx.fragment.app.e implements q0, vb.w {
    public final /* synthetic */ q0 N0 = r0.b();
    public final AutoClearedValue O0 = nd.a.a(this);
    public String P0;
    public je.d Q0;
    public String R0;
    public Bitmap S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public final wn.f X0;
    public final wn.f Y0;
    public final wn.f Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final wn.f f37725a1;

    /* renamed from: b1  reason: collision with root package name */
    public final wn.f f37726b1;

    /* renamed from: c1  reason: collision with root package name */
    public final wn.f f37727c1;

    /* renamed from: d1  reason: collision with root package name */
    public final wn.f f37728d1;

    /* renamed from: e1  reason: collision with root package name */
    public final wn.f f37729e1;

    /* renamed from: f1  reason: collision with root package name */
    public final FragmentRunner f37730f1;

    /* renamed from: h1  reason: collision with root package name */
    public static final /* synthetic */ qo.h<Object>[] f37723h1 = {f0.d(new jo.s(c.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentEmomoRegistrationBinding;", 0))};

    /* renamed from: g1  reason: collision with root package name */
    public static final a f37722g1 = new a(null);

    /* renamed from: i1  reason: collision with root package name */
    public static final int f37724i1 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(String str, UnityScreenshot unityScreenshot, String str2, String str3, String str4, boolean z10) {
            jo.p.h(str, "referer");
            jo.p.h(unityScreenshot, "screenshot");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "userName");
            jo.p.h(str4, "shareText");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putString("referer", str);
            bundle.putSerializable("screenshot", unityScreenshot);
            bundle.putString("EXTRA_USER_ID", str2);
            bundle.putString("EXTRA_USER_NAME", str3);
            bundle.putString("EXTRA_SHARE_TEXT", str4);
            bundle.putBoolean("EXTRA_IS_STREAMING", z10);
            cVar.V2(bundle);
            return cVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<wn.v> {
        public b() {
            super(0);
        }

        public final void a() {
            List<Fragment> p02 = c.this.p0().p0();
            jo.p.g(p02, "childFragmentManager.fragments");
            ArrayList<sd.b> arrayList = new ArrayList();
            for (Object obj : p02) {
                if (obj instanceof sd.b) {
                    arrayList.add(obj);
                }
            }
            for (sd.b bVar : arrayList) {
                bVar.n3();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* renamed from: je.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0523c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t2 f37733x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f37734y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0523c(t2 t2Var, boolean z10) {
            super(1);
            this.f37733x = t2Var;
            this.f37734y = z10;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            c.this.i4().d4(this.f37733x.J.isChecked());
            c.this.s4(this.f37733x.J.isChecked(), null);
            MRLogger c42 = c.this.c4();
            MRLog.Companion companion = MRLog.Companion;
            boolean z10 = this.f37734y;
            c cVar = c.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_SHARE_SCREEN);
            builder.setTargetId("ok");
            if (z10) {
                builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, cVar.b4().b())));
            }
            c42.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t2 f37736x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f37737y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t2 t2Var, boolean z10) {
            super(1);
            this.f37736x = t2Var;
            this.f37737y = z10;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            c.this.i4().d4(this.f37736x.J.isChecked());
            je.d dVar = c.this.Q0;
            if (dVar != null) {
                dVar.l();
            }
            c.this.X3();
            MRLogger c42 = c.this.c4();
            MRLog.Companion companion = MRLog.Companion;
            boolean z10 = this.f37737y;
            c cVar = c.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_SHARE_SCREEN);
            builder.setTargetId("take_photo");
            if (z10) {
                builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, cVar.b4().b())));
            }
            c42.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f37739x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10) {
            super(1);
            this.f37739x = z10;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            MRLogger c42 = c.this.c4();
            MRLog.Companion companion = MRLog.Companion;
            boolean z10 = this.f37739x;
            c cVar = c.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_SHARE_SCREEN);
            builder.setTargetId("save");
            if (z10) {
                builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, cVar.b4().b())));
            }
            c42.sendLog(builder.build());
            if (Build.VERSION.SDK_INT <= 29 && c3.a.a(c.this.N2(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                c.this.K2(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 200);
                return;
            }
            c cVar2 = c.this;
            cVar2.n4(cVar2.S0);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f37741x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f37742y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, String str) {
            super(1);
            this.f37741x = z10;
            this.f37742y = str;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            MRLogger c42 = c.this.c4();
            MRLog.Companion companion = MRLog.Companion;
            boolean z10 = this.f37741x;
            c cVar = c.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_SHARE_SCREEN);
            builder.setTargetId(Live.COMMENT_SHARE_TYPE_SHARE);
            if (z10) {
                builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, cVar.b4().b())));
            }
            c42.sendLog(builder.build());
            if (this.f37741x) {
                tb.a j10 = c.this.a4().j(null);
                j10.a().z3(c.this.p0(), j10.b());
                return;
            }
            c cVar2 = c.this;
            cVar2.q4(cVar2.S0, this.f37742y);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            c.this.k4().L3(false);
            c.this.Y3().G.setVisibility(8);
            c.this.Y3().E.setVisibility(8);
            k5.a aVar = k5.X0;
            String str = c.this.P0;
            if (str == null) {
                jo.p.v("referer");
                str = null;
            }
            aVar.a(str, c.this.h4()).z3(c.this.p0(), "UniqueEmomoGiftTypeSelectDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<UnityScreenshot> {
        public h() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final UnityScreenshot invoke() {
            Serializable serializable = c.this.M2().getSerializable("screenshot");
            jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.unity.UnityScreenshot");
            return (UnityScreenshot) serializable;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.EmomoRegistrationDialog$shareImage$1", f = "EmomoRegistrationDialog.kt", l = {594}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37745w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Bitmap f37747y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f37748z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.p<MRLogger, String, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String f37749w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(2);
                this.f37749w = str;
            }

            public final void a(MRLogger mRLogger, String str) {
                jo.p.h(mRLogger, "logger");
                MRLog.Companion companion = MRLog.Companion;
                String str2 = this.f37749w;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_SHARE_SHARE_PANEL);
                builder.setTargetId(MRLog.TARGET_ID_TAP);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(LogBase.SERVICE_NAME, str);
                wn.v vVar = wn.v.f59242a;
                builder.setPayload(xn.s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, str2), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString())));
                mRLogger.sendLog(builder.build());
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(MRLogger mRLogger, String str) {
                a(mRLogger, str);
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Bitmap bitmap, String str, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f37747y = bitmap;
            this.f37748z = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f37747y, this.f37748z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37745w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRLogger c42 = c.this.c4();
                    MRLog.Companion companion = MRLog.Companion;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_SHARE_SHARE_PANEL);
                    builder.setTargetId(MRLog.TARGET_ID_IMP);
                    c42.sendLog(builder.build());
                    k0 g42 = c.this.g4();
                    Bitmap bitmap = this.f37747y;
                    this.f37745w = 1;
                    obj = g42.a("FILE_NAME_SHARE_SHOT", bitmap, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                Uri a10 = c.this.Z3().a((File) obj);
                Intent intent = new Intent();
                String str = this.f37748z;
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", a10);
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.setType("image/png");
                String b10 = c.this.b4().b();
                Context q02 = c.this.q0();
                if (q02 != null) {
                    c.this.f3(Intent.createChooser(intent, "", PendingIntent.getBroadcast(q02, 0, ChooseReceiver.f25051x.a(q02, new a(b10)), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728).getIntentSender()));
                }
            } catch (FileNotFoundException unused) {
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<y> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37750w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37751x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37752y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37750w = componentCallbacks;
            this.f37751x = aVar;
            this.f37752y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.y, java.lang.Object] */
        @Override // io.a
        public final y invoke() {
            ComponentCallbacks componentCallbacks = this.f37750w;
            return gq.a.a(componentCallbacks).c(f0.b(y.class), this.f37751x, this.f37752y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37753w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37754x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37755y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37753w = componentCallbacks;
            this.f37754x = aVar;
            this.f37755y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f37753w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f37754x, this.f37755y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37756w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37757x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37758y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37756w = componentCallbacks;
            this.f37757x = aVar;
            this.f37758y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f37756w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f37757x, this.f37758y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37759w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37760x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37761y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37759w = componentCallbacks;
            this.f37760x = aVar;
            this.f37761y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f37759w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f37760x, this.f37761y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37762w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37763x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37764y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37762w = componentCallbacks;
            this.f37763x = aVar;
            this.f37764y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f37762w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.m.class), this.f37763x, this.f37764y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<kf.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37765w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37766x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37767y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37765w = componentCallbacks;
            this.f37766x = aVar;
            this.f37767y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.v, java.lang.Object] */
        @Override // io.a
        public final kf.v invoke() {
            ComponentCallbacks componentCallbacks = this.f37765w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.v.class), this.f37766x, this.f37767y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<of.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37768w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37769x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37770y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37768w = componentCallbacks;
            this.f37769x = aVar;
            this.f37770y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.r, java.lang.Object] */
        @Override // io.a
        public final of.r invoke() {
            ComponentCallbacks componentCallbacks = this.f37768w;
            return gq.a.a(componentCallbacks).c(f0.b(of.r.class), this.f37769x, this.f37770y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<kf.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37771w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37772x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37773y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37771w = componentCallbacks;
            this.f37772x = aVar;
            this.f37773y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final kf.t invoke() {
            ComponentCallbacks componentCallbacks = this.f37771w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.t.class), this.f37772x, this.f37773y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37774w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37775x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37776y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37774w = componentCallbacks;
            this.f37775x = aVar;
            this.f37776y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f37774w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f37775x, this.f37776y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<k0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f37777w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37778x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37779y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f37777w = componentCallbacks;
            this.f37778x = aVar;
            this.f37779y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hf.k0] */
        @Override // io.a
        public final k0 invoke() {
            ComponentCallbacks componentCallbacks = this.f37777w;
            return gq.a.a(componentCallbacks).c(f0.b(k0.class), this.f37778x, this.f37779y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f37780w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Fragment fragment) {
            super(0);
            this.f37780w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f37780w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f37780w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f37781w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(io.a aVar) {
            super(0);
            this.f37781w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f37781w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f37782w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f37783x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f37784y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f37785z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f37782w = aVar;
            this.f37783x = aVar2;
            this.f37784y = aVar3;
            this.f37785z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f37782w;
            vq.a aVar2 = this.f37783x;
            io.a aVar3 = this.f37784y;
            xq.a aVar4 = this.f37785z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(je.e.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f37786w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(io.a aVar) {
            super(0);
            this.f37786w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((androidx.lifecycle.v0) this.f37786w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.emomo.EmomoRegistrationDialog$updateProfile$1", f = "EmomoRegistrationDialog.kt", l = {330, 353}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class x extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ e0<File> A;

        /* renamed from: w  reason: collision with root package name */
        public int f37787w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f37789y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f37790z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str, boolean z10, e0<File> e0Var, ao.d<? super x> dVar) {
            super(2, dVar);
            this.f37789y = str;
            this.f37790z = z10;
            this.A = e0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new x(this.f37789y, this.f37790z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((x) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00de A[Catch: all -> 0x0025, Exception -> 0x0028, TryCatch #1 {Exception -> 0x0028, blocks: (B:6:0x0012, B:39:0x00d6, B:41:0x00de, B:42:0x00e1, B:44:0x00f3, B:10:0x001f, B:27:0x007f, B:29:0x0090, B:31:0x009c, B:32:0x00a0, B:33:0x00a6, B:35:0x00c9, B:36:0x00cd, B:17:0x002e, B:19:0x003c, B:20:0x0040, B:22:0x0053, B:24:0x005b), top: B:56:0x000c, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f3 A[Catch: all -> 0x0025, Exception -> 0x0028, TRY_LEAVE, TryCatch #1 {Exception -> 0x0028, blocks: (B:6:0x0012, B:39:0x00d6, B:41:0x00de, B:42:0x00e1, B:44:0x00f3, B:10:0x001f, B:27:0x007f, B:29:0x0090, B:31:0x009c, B:32:0x00a0, B:33:0x00a6, B:35:0x00c9, B:36:0x00cd, B:17:0x002e, B:19:0x003c, B:20:0x0040, B:22:0x0053, B:24:0x005b), top: B:56:0x000c, outer: #0 }] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 331
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: je.c.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.T0 = wn.g.b(iVar, new k(this, null, null));
        this.U0 = wn.g.b(iVar, new l(this, null, null));
        this.V0 = wn.g.b(iVar, new m(this, null, null));
        this.W0 = wn.g.b(iVar, new n(this, null, null));
        this.X0 = wn.g.b(iVar, new o(this, null, null));
        this.Y0 = wn.g.b(iVar, new p(this, null, null));
        this.Z0 = wn.g.b(iVar, new q(this, null, null));
        this.f37725a1 = wn.g.b(iVar, new r(this, null, null));
        this.f37726b1 = wn.g.b(iVar, new s(this, null, null));
        this.f37727c1 = wn.g.b(iVar, new j(this, null, null));
        t tVar = new t(this);
        xq.a a10 = gq.a.a(this);
        u uVar = new u(tVar);
        this.f37728d1 = androidx.fragment.app.e0.a(this, f0.b(je.e.class), new w(uVar), new v(tVar, null, null, a10));
        this.f37729e1 = wn.g.a(new h());
        this.f37730f1 = new FragmentRunner(this);
    }

    public static final void m4(t2 t2Var, View view) {
        AppCompatCheckBox appCompatCheckBox = t2Var.J;
        appCompatCheckBox.setChecked(!appCompatCheckBox.isChecked());
    }

    @Override // vb.w
    public void A2() {
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.Q0 = null;
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final void W3() {
        this.f37730f1.c(new b());
    }

    public final void X3() {
        if (m1() || h1()) {
            return;
        }
        n3();
    }

    @Override // androidx.fragment.app.Fragment
    public void Y1(int i10, String[] strArr, int[] iArr) {
        jo.p.h(strArr, "permissions");
        jo.p.h(iArr, "grantResults");
        if (i10 == 200) {
            if (c3.a.a(N2(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                n4(this.S0);
            } else {
                of.n.A(N2(), f1.text_error_save_to_cameraroll_description, false);
            }
        }
        super.Y1(i10, strArr, iArr);
    }

    public final t2 Y3() {
        return (t2) this.O0.b(this, f37723h1[0]);
    }

    public final y Z3() {
        return (y) this.f37727c1.getValue();
    }

    public final tb.c a4() {
        return (tb.c) this.T0.getValue();
    }

    public final kf.m b4() {
        return (kf.m) this.W0.getValue();
    }

    public final MRLogger c4() {
        return (MRLogger) this.f37725a1.getValue();
    }

    public final Bitmap d4(File file, UnityScreenshot unityScreenshot, String str, String str2) {
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        Bitmap decodeFile2 = BitmapFactory.decodeFile(unityScreenshot.getImagePath());
        Bitmap createBitmap = Bitmap.createBitmap(540, 960, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(decodeFile, 540, 1166);
        if (extractThumbnail != null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            wn.v vVar = wn.v.f59242a;
            canvas.drawBitmap(extractThumbnail, 0.0f, -93.0f, paint);
        }
        Bitmap extractThumbnail2 = ThumbnailUtils.extractThumbnail(decodeFile2, 1076, 1076);
        if (extractThumbnail2 != null) {
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            wn.v vVar2 = wn.v.f59242a;
            canvas.drawBitmap(extractThumbnail2, -270.0f, -116.0f, paint2);
        }
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setShader(new LinearGradient(0.0f, 873.0f, 0.0f, 960.0f, new int[]{0, Color.argb(26, 0, 0, 0), Color.argb(115, 0, 0, 0)}, new float[]{0.0f, 0.3f, 1.0f}, Shader.TileMode.CLAMP));
        wn.v vVar3 = wn.v.f59242a;
        canvas.drawRect(0.0f, 873.0f, 540.0f, 960.0f, paint3);
        Bitmap extractThumbnail3 = ThumbnailUtils.extractThumbnail(BitmapFactory.decodeResource(O0(), y0.logo_small), 143, 29);
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        canvas.drawBitmap(extractThumbnail3, 383.0f, 919.0f, paint4);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(-1);
        textPaint.setTextSize(14.0f);
        if (b4.a.a().c() == 1) {
            canvas.save();
            canvas.translate(12.0f, 919.0f);
            CharSequence l10 = b4.a.a().l(str2);
            StaticLayout.Builder.obtain(l10, 0, l10.length(), textPaint, canvas.getWidth()).build().draw(canvas);
            canvas.restore();
        } else {
            canvas.drawText(str2, 12.0f, 934.0f, textPaint);
        }
        String V0 = V0(f1.text_avatar_image_user_id, str);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint2.setColor(-1);
        textPaint2.setTextSize(10.0f);
        canvas.drawText(V0, 14.0f, 949.0f, textPaint2);
        jo.p.g(createBitmap, "shareShotImage");
        return createBitmap;
    }

    public final of.r e4() {
        return (of.r) this.Y0.getValue();
    }

    public final MRRequest f4() {
        return (MRRequest) this.U0.getValue();
    }

    public final k0 g4() {
        return (k0) this.f37726b1.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    public final UnityScreenshot h4() {
        return (UnityScreenshot) this.f37729e1.getValue();
    }

    public final kf.t i4() {
        return (kf.t) this.Z0.getValue();
    }

    public final je.e j4() {
        return (je.e) this.f37728d1.getValue();
    }

    public final kf.v k4() {
        return (kf.v) this.X0.getValue();
    }

    public final v0 l4() {
        return (v0) this.V0.getValue();
    }

    public final void n4(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        String str = "emomo_share_" + SystemClock.uptimeMillis() + ".png";
        ContentResolver contentResolver = N2().getContentResolver();
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", "image/png");
            contentValues.put("is_pending", (Integer) 1);
            Uri insert = contentResolver.insert(MediaStore.Images.Media.getContentUri("external_primary"), contentValues);
            jo.p.e(insert);
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(insert, "w", null);
            try {
                jo.p.e(openFileDescriptor);
                OutputStream fileOutputStream = new FileOutputStream(openFileDescriptor.getFileDescriptor());
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                go.a.a(fileOutputStream, null);
                go.a.a(openFileDescriptor, null);
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                contentResolver.update(insert, contentValues, null, null);
                of.n.A(N2(), f1.text_saved_image, false);
                return;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    go.a.a(openFileDescriptor, th2);
                    throw th3;
                }
            }
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
        fileOutputStream2.close();
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("mime_type", "image/png");
        contentValues2.put("_data", file.getAbsolutePath());
        contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues2);
        of.n.A(N2(), f1.text_saved_image, false);
    }

    public final void o4(t2 t2Var) {
        this.O0.a(this, f37723h1[0], t2Var);
    }

    public final void p4(UnityScreenshot unityScreenshot) {
        File f10 = j4().f().f();
        if (f10 == null) {
            return;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(f10.getAbsolutePath());
        Bitmap decodeFile2 = BitmapFactory.decodeFile(unityScreenshot.getImagePath());
        int faceSize = (int) (unityScreenshot.getFaceSize() * 1.7d);
        Bitmap createBitmap = Bitmap.createBitmap(unityScreenshot.getPixelWidth(), unityScreenshot.getPixelHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (decodeFile != null) {
            Matrix matrix = new Matrix();
            matrix.postScale(unityScreenshot.getPixelWidth() / decodeFile.getWidth(), unityScreenshot.getPixelHeight() / decodeFile.getHeight());
            canvas.drawBitmap(decodeFile, matrix, null);
        }
        if (decodeFile2 != null) {
            canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, (Paint) null);
        }
        int i10 = faceSize / 2;
        int max = Math.max(0, unityScreenshot.getFacePositionCenterX() - i10);
        int max2 = Math.max(0, unityScreenshot.getFacePositionCenterY() - i10);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, max, max2, Math.min(faceSize, unityScreenshot.getPixelWidth() - max), Math.min(faceSize, unityScreenshot.getPixelHeight() - max2));
        try {
            this.R0 = N2().getCacheDir().toString() + "/profile_image.png";
            createBitmap2.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(this.R0));
        } catch (FileNotFoundException unused) {
        }
    }

    public final void q4(Bitmap bitmap, String str) {
        if (bitmap == null) {
            return;
        }
        uo.l.d(v1.f56093w, g1.c(), null, new i(bitmap, str, null), 2, null);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        String string = M2().getString("referer");
        jo.p.e(string);
        this.P0 = string;
        String string2 = M2().getString("EXTRA_SHARE_TEXT");
        jo.p.e(string2);
        String string3 = M2().getString("EXTRA_USER_ID");
        jo.p.e(string3);
        String string4 = M2().getString("EXTRA_USER_NAME");
        jo.p.e(string4);
        w3(false);
        boolean z10 = M2().getBoolean("EXTRA_IS_STREAMING");
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), b1.dialog_fragment_emomo_registration, null, false);
        final t2 t2Var = (t2) e10;
        t2Var.J.setChecked(i4().l3());
        t2Var.K.setOnClickListener(new View.OnClickListener() { // from class: je.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.m4(t2.this, view);
            }
        });
        AppCompatButton appCompatButton = t2Var.M;
        jo.p.g(appCompatButton, "updateAccount");
        yd.g1.a(appCompatButton, new C0523c(t2Var, z10));
        AppCompatTextView appCompatTextView = t2Var.D;
        jo.p.g(appCompatTextView, "editPoseTextView");
        yd.g1.a(appCompatTextView, new d(t2Var, z10));
        AppCompatTextView appCompatTextView2 = t2Var.D;
        appCompatTextView2.setPaintFlags(appCompatTextView2.getPaintFlags() | 8);
        jo.p.g(e10, "inflate<DialogFragmentEm…RLINE_TEXT_FLAG\n        }");
        o4(t2Var);
        if (k4().f5()) {
            Y3().G.setVisibility(0);
            Y3().E.setVisibility(0);
        } else {
            Y3().G.setVisibility(8);
            Y3().E.setVisibility(8);
        }
        File f10 = j4().f().f();
        if (f10 != null) {
            this.S0 = d4(f10, h4(), string3, string4);
            int b10 = N2().getResources().getDisplayMetrics().heightPixels - de.e.b(this, 330);
            if (b10 > de.e.b(this, 406)) {
                b10 = de.e.b(this, 406);
            }
            ViewGroup.LayoutParams layoutParams = Y3().B.getLayoutParams();
            layoutParams.height = b10;
            layoutParams.width = (int) ((b10 * de.e.b(this, 229)) / de.e.b(this, 406));
            GlideRequest<Drawable> load = GlideApp.with(N2()).load(this.S0);
            AppCompatImageView appCompatImageView = Y3().B;
            jo.p.g(appCompatImageView, "binding.avatarImageView");
            load.apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(new v7.i(), new v7.y(de.n.b(appCompatImageView, 8))))).into(Y3().B);
            ImageButton imageButton = Y3().H;
            jo.p.g(imageButton, "binding.saveImageView");
            yd.g1.a(imageButton, new e(z10));
            ImageButton imageButton2 = Y3().L;
            jo.p.g(imageButton2, "binding.shareImageView");
            yd.g1.a(imageButton2, new f(z10, string2));
            ImageButton imageButton3 = Y3().F;
            jo.p.g(imageButton3, "binding.makeGiftImageView");
            yd.g1.a(imageButton3, new g());
        }
        MRLogger c42 = c4();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_SHARE_SCREEN);
        builder.setTargetId(MRLog.TARGET_ID_IMP);
        if (z10) {
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, b4().b())));
        }
        c42.sendLog(builder.build());
        Serializable serializable = M2().getSerializable("screenshot");
        jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.unity.UnityScreenshot");
        p4((UnityScreenshot) serializable);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(Y3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }

    public final void r4() {
        List<Fragment> p02 = p0().p0();
        jo.p.g(p02, "childFragmentManager.fragments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : p02) {
            if (obj instanceof sd.b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            sd.b.O0.a(false).z3(p0(), "ProgressDialogFragment");
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.io.File] */
    public final void s4(boolean z10, String str) {
        e0 e0Var = new e0();
        String str2 = this.R0;
        if (!(str2 == null || str2.length() == 0)) {
            ?? file = new File(this.R0);
            e0Var.f38136w = file;
            File file2 = (File) file;
            if (!file.exists()) {
                e0Var.f38136w = null;
            }
        }
        r4();
        uo.l.d(this, null, null, new x(str, z10, e0Var, null), 3, null);
    }

    @Override // vb.w
    public void t0() {
        String string = M2().getString("EXTRA_SHARE_TEXT");
        jo.p.e(string);
        q4(this.S0, string);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.Q0 = context instanceof je.d ? (je.d) context : null;
    }
}
