package com.dena.mirrativ.catalog;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import ao.g;
import co.l;
import com.dena.mirrativ.catalog.LivePreview;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.video.VideoListener;
import da.j;
import io.p;
import jf.j0;
import jo.f0;
import jo.h;
import jo.q;
import kotlin.KotlinNothingValueException;
import nd.i1;
import oq.a;
import r8.g1;
import sf.j;
import t8.g2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import xo.g0;

/* loaded from: classes.dex */
public final class LivePreview extends FrameLayout implements oq.a, q0 {
    public SimpleExoPlayer A;
    public String B;
    public j0 C;
    public final c D;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j f20392w;

    /* renamed from: x  reason: collision with root package name */
    public final g2 f20393x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f20394y;

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f20395z;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20396a;

        static {
            int[] iArr = new int[j0.values().length];
            iArr[j0.VERTICAL.ordinal()] = 1;
            iArr[j0.ROTATE_90.ordinal()] = 2;
            iArr[j0.ROTATE_270.ordinal()] = 3;
            f20396a = iArr;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LivePreview$bind$2", f = "LivePreview.kt", l = {118}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20397w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ LivePreview f20399w;

            public a(LivePreview livePreview) {
                this.f20399w = livePreview;
            }

            public final Object a(boolean z10, ao.d<? super v> dVar) {
                if (this.f20399w.getSharedApplicationModel().a().d() && z10) {
                    this.f20399w.l();
                }
                return v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f20397w;
            if (i10 == 0) {
                m.b(obj);
                g0<Boolean> Q0 = LivePreview.this.getCastServiceStore().Q0();
                a aVar = new a(LivePreview.this);
                this.f20397w = 1;
                if (Q0.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements VideoListener {

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f20401a;

            static {
                int[] iArr = new int[j0.values().length];
                iArr[j0.VERTICAL.ordinal()] = 1;
                iArr[j0.ROTATE_90.ordinal()] = 2;
                iArr[j0.ROTATE_270.ordinal()] = 3;
                f20401a = iArr;
            }
        }

        public c() {
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
            int i13 = a.f20401a[LivePreview.this.C.ordinal()];
            if (i13 == 1) {
                TextureView textureView = LivePreview.this.f20393x.E;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((LivePreview.this.f20393x.C.getHeight() * 1.2f) * i10) / i11), LivePreview.this.f20393x.C.getHeight());
                layoutParams.gravity = 17;
                textureView.setLayoutParams(layoutParams);
                TextureView textureView2 = LivePreview.this.f20393x.E;
                Matrix matrix = new Matrix();
                LivePreview livePreview = LivePreview.this;
                matrix.postScale(1.0f, 1.2f, livePreview.f20393x.E.getLayoutParams().width / 2.0f, livePreview.f20393x.E.getLayoutParams().height / 2.0f);
                textureView2.setTransform(matrix);
            } else if (i13 == 2 || i13 == 3) {
                TextureView textureView3 = LivePreview.this.f20393x.E;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) ((LivePreview.this.f20393x.C.getHeight() * i11) / i10), LivePreview.this.f20393x.C.getHeight());
                layoutParams2.gravity = 17;
                textureView3.setLayoutParams(layoutParams2);
                float f11 = LivePreview.this.C == j0.ROTATE_90 ? 270.0f : 90.0f;
                TextureView textureView4 = LivePreview.this.f20393x.E;
                Matrix matrix2 = new Matrix();
                LivePreview livePreview2 = LivePreview.this;
                matrix2.postRotate(f11, livePreview2.f20393x.E.getLayoutParams().width / 2.0f, livePreview2.f20393x.E.getLayoutParams().height / 2.0f);
                float height = livePreview2.f20393x.E.getLayoutParams().width / livePreview2.f20393x.C.getHeight();
                matrix2.postScale(height, 1.0f / height, livePreview2.f20393x.E.getLayoutParams().width / 2.0f, livePreview2.f20393x.E.getLayoutParams().height / 2.0f);
                textureView4.setTransform(matrix2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f20402w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20403x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20404y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f20402w = aVar;
            this.f20403x = aVar2;
            this.f20404y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            xq.a b10;
            oq.a aVar = this.f20402w;
            vq.a aVar2 = this.f20403x;
            io.a<? extends uq.a> aVar3 = this.f20404y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(i1.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f20405w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20406x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20407y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f20405w = aVar;
            this.f20406x = aVar2;
            this.f20407y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            xq.a b10;
            oq.a aVar = this.f20405w;
            vq.a aVar2 = this.f20406x;
            io.a<? extends uq.a> aVar3 = this.f20407y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(nf.c.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements sf.j {
        public f() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onLoadingChanged(boolean z10) {
            j.a.a(this, z10);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            j.a.b(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            j.a.c(this, exoPlaybackException);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z10, int i10) {
            if (i10 == 3 && z10) {
                LivePreview.this.f20393x.B.setVisibility(8);
                LivePreview.this.f20393x.E.setVisibility(0);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(int i10) {
            j.a.d(this, i10);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int i10) {
            j.a.e(this, i10);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onSeekProcessed() {
            j.a.f(this);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onShuffleModeEnabledChanged(boolean z10) {
            j.a.g(this, z10);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, Object obj, int i10) {
            j.a.h(this, timeline, obj, i10);
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            j.a.i(this, trackGroupArray, trackSelectionArray);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LivePreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ LivePreview(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nf.c getCastServiceStore() {
        return (nf.c) this.f20395z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i1 getSharedApplicationModel() {
        return (i1) this.f20394y.getValue();
    }

    public static final void j(LivePreview livePreview, Boolean bool) {
        jo.p.h(livePreview, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            livePreview.k();
        } else {
            livePreview.l();
        }
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.f20392w.getCoroutineContext();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void h(String str, String str2, String str3, j0 j0Var, e0<Boolean> e0Var, e8.h hVar, int i10, int i11, int i12, int i13, u uVar) {
        jo.p.h(str, "liveBlurImageUrl");
        jo.p.h(str2, "livePreviewImageUrl");
        jo.p.h(j0Var, "orientation");
        jo.p.h(e0Var, "isPlaying");
        jo.p.h(hVar, "previewRequestOptions");
        jo.p.h(uVar, "lifecycleOwner");
        int i14 = a.f20396a[j0Var.ordinal()];
        if (i14 == 1) {
            ViewGroup.LayoutParams layoutParams = this.f20393x.C.getLayoutParams();
            jo.p.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.b) layoutParams).setMargins(0, 0, 0, 0);
        } else if (i14 == 2 || i14 == 3) {
            ViewGroup.LayoutParams layoutParams2 = this.f20393x.C.getLayoutParams();
            jo.p.f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.b) layoutParams2).setMargins(i10, i11, i12, i13);
        }
        GlideRequest<Drawable> load = GlideApp.with(this.f20393x.D).load(str);
        int i15 = g1.f49914h;
        load.placeholder(i15).apply((e8.a<?>) hVar).into(this.f20393x.D).a();
        GlideApp.with(this.f20393x.B).load(str2).placeholder(i15).apply((e8.a<?>) hVar).into(this.f20393x.B).a();
        this.f20393x.B.setVisibility(0);
        this.f20393x.E.setVisibility(8);
        this.B = str3;
        this.C = j0Var;
        e0Var.i(uVar, new androidx.lifecycle.f0() { // from class: r8.y0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LivePreview.j(LivePreview.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new b(null), 3, null);
        this.f20393x.o();
    }

    public final void k() {
        if (this.A != null || this.B == null) {
            return;
        }
        if (getSharedApplicationModel().a().d() && getCastServiceStore().Q0().getValue().booleanValue()) {
            return;
        }
        this.A = new SimpleExoPlayer.Builder(this.f20393x.u().getContext()).build();
        HlsMediaSource createMediaSource = new HlsMediaSource.Factory(new DefaultDataSourceFactory(this.f20393x.u().getContext(), ApiUtil.INSTANCE.userAgent())).createMediaSource(Uri.parse(this.B));
        jo.p.g(createMediaSource, "Factory(dataSourceFactory).createMediaSource(uri)");
        SimpleExoPlayer simpleExoPlayer = this.A;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.prepare(createMediaSource);
        }
        SimpleExoPlayer simpleExoPlayer2 = this.A;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.setVolume(0.0f);
        }
        SimpleExoPlayer simpleExoPlayer3 = this.A;
        if (simpleExoPlayer3 != null) {
            simpleExoPlayer3.setVideoTextureView(this.f20393x.E);
        }
        SimpleExoPlayer simpleExoPlayer4 = this.A;
        if (simpleExoPlayer4 != null) {
            simpleExoPlayer4.setPlayWhenReady(true);
        }
        f fVar = new f();
        SimpleExoPlayer simpleExoPlayer5 = this.A;
        if (simpleExoPlayer5 != null) {
            simpleExoPlayer5.addListener(fVar);
        }
        SimpleExoPlayer simpleExoPlayer6 = this.A;
        if (simpleExoPlayer6 != null) {
            simpleExoPlayer6.addVideoListener(this.D);
        }
    }

    public final void l() {
        this.f20393x.E.setVisibility(8);
        this.f20393x.B.setVisibility(0);
        SimpleExoPlayer simpleExoPlayer = this.A;
        if (simpleExoPlayer != null) {
            if (simpleExoPlayer != null) {
                simpleExoPlayer.stop();
            }
            SimpleExoPlayer simpleExoPlayer2 = this.A;
            if (simpleExoPlayer2 != null) {
                simpleExoPlayer2.release();
            }
            this.A = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        SimpleExoPlayer simpleExoPlayer = this.A;
        if (simpleExoPlayer != null) {
            if (simpleExoPlayer != null) {
                simpleExoPlayer.stop();
            }
            SimpleExoPlayer simpleExoPlayer2 = this.A;
            if (simpleExoPlayer2 != null) {
                simpleExoPlayer2.release();
            }
            this.A = null;
        }
        r0.d(this, null, 1, null);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePreview(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jo.p.h(context, "context");
        this.f20392w = new da.j();
        g2 T = g2.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f20393x = T;
        cr.a aVar = cr.a.f28611a;
        this.f20394y = wn.g.b(aVar.b(), new d(this, null, null));
        this.f20395z = wn.g.b(aVar.b(), new e(this, null, null));
        this.C = j0.VERTICAL;
        this.D = new c();
    }
}
