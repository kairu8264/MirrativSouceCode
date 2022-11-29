package xb;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import java.util.ArrayDeque;
import java.util.Locale;
import uo.d2;
import uo.i2;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f59893a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f59894b;

    /* renamed from: c  reason: collision with root package name */
    public final kf.t f59895c;

    /* renamed from: d  reason: collision with root package name */
    public final TextToSpeech.OnInitListener f59896d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<String> f59897e;

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f59898f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f59899g;

    /* renamed from: h  reason: collision with root package name */
    public final uo.b0 f59900h;

    /* renamed from: i  reason: collision with root package name */
    public TextToSpeech f59901i;

    /* renamed from: j  reason: collision with root package name */
    public float f59902j;

    /* renamed from: k  reason: collision with root package name */
    public final d f59903k;

    /* renamed from: l  reason: collision with root package name */
    public final a f59904l;

    /* renamed from: m  reason: collision with root package name */
    public final b f59905m;

    /* loaded from: classes2.dex */
    public static final class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            h0.this.u();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ContentObserver {
        public b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            h0.this.v();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends UtteranceProgressListener {
        public c() {
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onDone(String str) {
            jo.p.h(str, "utteranceId");
            if (h0.this.f59897e.isEmpty()) {
                return;
            }
            int size = h0.this.f59897e.size();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) h0.this.f59897e.poll());
            if (size > 3) {
                sb2.append(h0.this.m().getResources().getString(r.text_speech_omit, String.valueOf(size)));
                h0.this.f59897e.clear();
            }
            h0 h0Var = h0.this;
            String sb3 = sb2.toString();
            jo.p.g(sb3, "commentBuilder.toString()");
            h0Var.s(sb3);
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onError(String str) {
            jo.p.h(str, "utteranceId");
            h0.this.f59897e.clear();
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onStart(String str) {
            jo.p.h(str, "utteranceId");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends ContentObserver {
        public d(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            h0.this.t();
        }
    }

    public h0(Context context, boolean z10, kf.t tVar) {
        uo.b0 b10;
        jo.p.h(context, "context");
        jo.p.h(tVar, "settingPreference");
        this.f59893a = context;
        this.f59894b = z10;
        this.f59895c = tVar;
        TextToSpeech.OnInitListener onInitListener = new TextToSpeech.OnInitListener() { // from class: xb.f0
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i10) {
                h0.o(h0.this, i10);
            }
        };
        this.f59896d = onInitListener;
        this.f59897e = new ArrayDeque<>();
        ContentResolver contentResolver = context.getContentResolver();
        jo.p.g(contentResolver, "context.contentResolver");
        this.f59898f = contentResolver;
        Handler handler = new Handler();
        this.f59899g = handler;
        b10 = i2.b(null, 1, null);
        this.f59900h = b10;
        this.f59901i = new TextToSpeech(context, onInitListener);
        this.f59902j = tVar.D0();
        this.f59903k = new d(handler);
        this.f59904l = new a(handler);
        this.f59905m = new b(handler);
    }

    public static final void k(h0 h0Var, int i10) {
        jo.p.h(h0Var, "this$0");
        if (i10 != 0) {
            h0Var.f59895c.U2(false);
            dq.c.c().l(new nd.l());
        }
    }

    public static final void o(h0 h0Var, int i10) {
        jo.p.h(h0Var, "this$0");
        h0Var.r();
    }

    public final void h(String str) {
        jo.p.h(str, "speech");
        if (!this.f59901i.isSpeaking()) {
            s(str);
        } else {
            this.f59897e.add(str);
        }
    }

    public final void i() {
        String string = this.f59893a.getResources().getString(r.text_to_speech_sample);
        jo.p.g(string, "context.resources.getStr…ng.text_to_speech_sample)");
        h(string);
    }

    public final void j() {
        new TextToSpeech(this.f59893a, new TextToSpeech.OnInitListener() { // from class: xb.g0
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i10) {
                h0.k(h0.this, i10);
            }
        }).shutdown();
    }

    public final void l() {
        d2.a.a(this.f59900h, null, 1, null);
        this.f59901i.stop();
        this.f59901i.shutdown();
    }

    public final Context m() {
        return this.f59893a;
    }

    public final float n() {
        if (this.f59894b) {
            return 0.0f;
        }
        return this.f59902j;
    }

    public final void p(boolean z10) {
        this.f59894b = z10;
    }

    public final void q(float f10) {
        this.f59902j = f10;
        this.f59895c.c3(n());
    }

    public final void r() {
        Uri uriFor = Settings.Secure.getUriFor("tts_default_synth");
        Uri uriFor2 = Settings.Secure.getUriFor("tts_default_pitch");
        Uri uriFor3 = Settings.Secure.getUriFor("tts_default_rate");
        try {
            this.f59898f.registerContentObserver(uriFor, false, this.f59903k);
            this.f59898f.registerContentObserver(uriFor2, false, this.f59904l);
            this.f59898f.registerContentObserver(uriFor3, false, this.f59905m);
            u();
            v();
            this.f59901i.setLanguage(Locale.getDefault());
            this.f59901i.setOnUtteranceProgressListener(new c());
        } catch (NullPointerException e10) {
            g9.a.c(e10);
        }
    }

    public final void s(String str) {
        Bundle bundle = new Bundle();
        bundle.putFloat("volume", n());
        this.f59901i.speak(str, 1, bundle, "callback");
    }

    public final void t() {
        l();
        this.f59901i = new TextToSpeech(this.f59893a, this.f59896d, Settings.Secure.getString(this.f59898f, "tts_default_synth"));
    }

    public final void u() {
        this.f59901i.setPitch(Settings.Secure.getInt(this.f59898f, "tts_default_pitch", 100) / 100.0f);
    }

    public final void v() {
        this.f59901i.setSpeechRate(Settings.Secure.getInt(this.f59898f, "tts_default_rate", 100) / 100.0f);
    }
}
