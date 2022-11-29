package gc;

import ac.d2;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatButton;
import fa.b;
import nd.p0;
import oq.a;
import yd.g1;

/* loaded from: classes2.dex */
public final class k0 extends FrameLayout implements oq.a, fa.b {

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f32977w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f32978x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f32979y;

    /* renamed from: z  reason: collision with root package name */
    public static final c f32976z = new c(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k0.this.getFloatViewManager().c(k0.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            jo.p.h(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            jo.p.h(seekBar, "seekBar");
            dq.c.c().l(new p0(seekBar.getProgress() / 10.0f));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k0.this.h();
            k0.this.getFloatViewManager().c(k0.this);
            dq.c.c().l(new nd.t());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k0.this.g();
            k0.this.getFloatViewManager().c(k0.this);
            dq.c.c().l(new nd.t());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32983w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32984x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32985y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32983w = aVar;
            this.f32984x = aVar2;
            this.f32985y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            xq.a b10;
            oq.a aVar = this.f32983w;
            vq.a aVar2 = this.f32984x;
            io.a<? extends uq.a> aVar3 = this.f32985y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hf.r.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<kf.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32986w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32987x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32988y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32986w = aVar;
            this.f32987x = aVar2;
            this.f32988y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final kf.t invoke() {
            xq.a b10;
            oq.a aVar = this.f32986w;
            vq.a aVar2 = this.f32987x;
            io.a<? extends uq.a> aVar3 = this.f32988y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.t.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32989w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32990x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32991y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32989w = aVar;
            this.f32990x = aVar2;
            this.f32991y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f32989w;
            vq.a aVar2 = this.f32990x;
            io.a<? extends uq.a> aVar3 = this.f32991y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context) {
        super(context);
        jo.p.h(context, "context");
        cr.a aVar = cr.a.f28611a;
        this.f32977w = wn.g.b(aVar.b(), new f(this, null, null));
        this.f32978x = wn.g.b(aVar.b(), new g(this, null, null));
        this.f32979y = wn.g.b(aVar.b(), new h(this, null, null));
        g1.a(this, new a());
        final d2 T = d2.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n            Lay…           true\n        )");
        new TextToSpeech(context, new TextToSpeech.OnInitListener() { // from class: gc.j0
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i10) {
                k0.b(d2.this, this, i10);
            }
        });
        T.I.setOnSeekBarChangeListener(new b());
        T.I.setProgress(getSettingPreference().f1() ? (int) (getSettingPreference().D0() * 10.0f) : 0);
    }

    public static final void b(d2 d2Var, k0 k0Var, int i10) {
        jo.p.h(d2Var, "$binding");
        jo.p.h(k0Var, "this$0");
        if (i10 == 0) {
            d2Var.E.setText(k0Var.getResources().getString(xb.r.text_to_speech_detail_description));
            AppCompatButton appCompatButton = d2Var.F;
            jo.p.g(appCompatButton, "binding.ttsDetailOpenButton");
            g1.a(appCompatButton, new d());
            return;
        }
        d2Var.E.setText(k0Var.getResources().getString(xb.r.text_to_speech_detail_description_dl));
        AppCompatButton appCompatButton2 = d2Var.F;
        jo.p.g(appCompatButton2, "binding.ttsDetailOpenButton");
        g1.a(appCompatButton2, new e());
    }

    private final hf.r getFeatureHelper() {
        return (hf.r) this.f32977w.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f32979y.getValue();
    }

    private final kf.t getSettingPreference() {
        return (kf.t) this.f32978x.getValue();
    }

    public final void g() {
        String g10 = getFeatureHelper().g();
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + g10));
            intent.setFlags(268435456);
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + g10));
            intent2.setFlags(268435456);
            getContext().startActivity(intent2);
        }
    }

    @Override // fa.b
    public View getFloatViewContentView() {
        return this;
    }

    @Override // fa.b
    public int getFloatViewGravity() {
        return b.a.a(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutFlags() {
        return b.a.b(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutHeight() {
        return b.a.c(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutWidth() {
        return b.a.d(this);
    }

    @Override // fa.b
    public String getFloatViewTag() {
        return "FloatSettingTTSView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void h() {
        Intent intent = new Intent();
        intent.setAction("com.android.settings.TTS_SETTINGS");
        intent.setFlags(268435456);
        getContext().startActivity(intent);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        getFloatViewManager().c(this);
    }
}
