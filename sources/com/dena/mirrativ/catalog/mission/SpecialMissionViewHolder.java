package com.dena.mirrativ.catalog.mission;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.catalog.mission.SpecialMissionViewHolder;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.cache.CacheDataSourceFactory;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.google.android.exoplayer2.video.VideoListener;
import de.n;
import io.l;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import oq.a;
import r8.b1;
import t8.a2;
import wn.v;
import z8.a0;

/* loaded from: classes.dex */
public final class SpecialMissionViewHolder extends RecyclerView.e0 implements oq.a {
    public static final a A = new a(null);
    public static final int B = 8;

    /* renamed from: w  reason: collision with root package name */
    public final a2 f20698w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f20699x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f20700y;

    /* renamed from: z  reason: collision with root package name */
    public SimpleExoPlayer f20701z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final SpecialMissionViewHolder a(ViewGroup viewGroup) {
            p.h(viewGroup, "parent");
            a2 T = a2.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            p.g(T, "inflate(LayoutInflater.f….context), parent, false)");
            return new SpecialMissionViewHolder(T);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<Boolean, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a0 f20702w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var) {
            super(1);
            this.f20702w = a0Var;
        }

        public final void a(boolean z10) {
            if (z10) {
                this.f20702w.g().p(Boolean.FALSE);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Boolean bool) {
            a(bool.booleanValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Player.EventListener {
        public c() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z10, int i10) {
            if (i10 == 4) {
                SpecialMissionViewHolder.this.i().F.setVisibility(0);
                SpecialMissionViewHolder.this.i().E.setVisibility(0);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements VideoListener {
        public d() {
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
            SpecialMissionViewHolder.this.i().G.setVisibility(8);
            SpecialMissionViewHolder.this.i().K.setVisibility(8);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends ViewOutlineProvider {
        public e() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view == null) {
                return;
            }
            float f10 = SpecialMissionViewHolder.this.itemView.getResources().getDisplayMetrics().density * 6;
            if (outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), f10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f20709w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20710x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20711y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f20709w = aVar;
            this.f20710x = aVar2;
            this.f20711y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            xq.a b10;
            oq.a aVar = this.f20709w;
            vq.a aVar2 = this.f20710x;
            io.a<? extends uq.a> aVar3 = this.f20711y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(MRLogger.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.a<SimpleCache> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f20712w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20713x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20714y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f20712w = aVar;
            this.f20713x = aVar2;
            this.f20714y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.exoplayer2.upstream.cache.SimpleCache] */
        @Override // io.a
        public final SimpleCache invoke() {
            xq.a b10;
            oq.a aVar = this.f20712w;
            vq.a aVar2 = this.f20713x;
            io.a<? extends uq.a> aVar3 = this.f20714y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(SimpleCache.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialMissionViewHolder(a2 a2Var) {
        super(a2Var.u());
        p.h(a2Var, "binding");
        this.f20698w = a2Var;
        cr.a aVar = cr.a.f28611a;
        this.f20699x = wn.g.b(aVar.b(), new f(this, null, null));
        this.f20700y = wn.g.b(aVar.b(), new g(this, null, null));
    }

    public static final void f(SpecialMissionViewHolder specialMissionViewHolder, a0 a0Var, View view) {
        p.h(specialMissionViewHolder, "this$0");
        p.h(a0Var, "$specialMissionBindModel");
        specialMissionViewHolder.l(a0Var);
    }

    public static final void g(SpecialMissionViewHolder specialMissionViewHolder, a0 a0Var, View view) {
        p.h(specialMissionViewHolder, "this$0");
        p.h(a0Var, "$specialMissionBindModel");
        specialMissionViewHolder.l(a0Var);
    }

    public static final void h(SpecialMissionViewHolder specialMissionViewHolder, a0 a0Var, Boolean bool) {
        p.h(specialMissionViewHolder, "this$0");
        p.h(a0Var, "$specialMissionBindModel");
        p.g(bool, "isPlaying");
        if (bool.booleanValue()) {
            specialMissionViewHolder.m(a0Var.f());
            MRLogger j10 = specialMissionViewHolder.j();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_DAILY_MISSION_MOVIE_PLAY);
            builder.setTargetId(String.valueOf(a0Var.d()));
            j10.sendLog(builder.build());
            return;
        }
        SimpleExoPlayer simpleExoPlayer = specialMissionViewHolder.f20701z;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.stop();
            simpleExoPlayer.release();
            specialMissionViewHolder.f20701z = null;
        }
    }

    public final void d(final a0 a0Var, u uVar, l<? super Integer, v> lVar, l<? super z8.g, v> lVar2) {
        p.h(a0Var, "specialMissionBindModel");
        p.h(uVar, "lifecycleOwner");
        p.h(lVar, "onClickSpecialMissionGetButton");
        p.h(lVar2, "onClickRewardDetail");
        AppCompatImageView appCompatImageView = this.f20698w.C;
        p.g(appCompatImageView, "binding.iconImageView");
        td.a.m(appCompatImageView, a0Var.c());
        this.f20698w.B.setText(a0Var.a());
        this.f20698w.J.c(a0Var.e(), false, uVar, lVar, lVar2, new b(a0Var));
        this.f20698w.D.setOnClickListener(new View.OnClickListener() { // from class: z8.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpecialMissionViewHolder.f(SpecialMissionViewHolder.this, a0Var, view);
            }
        });
        View videoSurfaceView = this.f20698w.I.getVideoSurfaceView();
        if (videoSurfaceView != null) {
            videoSurfaceView.setOnClickListener(new View.OnClickListener() { // from class: z8.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SpecialMissionViewHolder.g(SpecialMissionViewHolder.this, a0Var, view);
                }
            });
        }
        GlideRequest<Drawable> load = GlideApp.with(this.f20698w.F).load(a0Var.c());
        AppCompatImageView appCompatImageView2 = this.f20698w.F;
        p.g(appCompatImageView2, "binding.overlayIconImageView");
        int b10 = n.b(appCompatImageView2, 20);
        AppCompatImageView appCompatImageView3 = this.f20698w.F;
        p.g(appCompatImageView3, "binding.overlayIconImageView");
        load.apply((e8.a<?>) e8.h.bitmapTransform(new xd.d(b10, n.b(appCompatImageView3, 2), c3.a.d(this.f20698w.F.getContext(), b1.f49836f)))).into(this.f20698w.F);
        a0Var.g().i(uVar, new androidx.lifecycle.f0() { // from class: z8.d0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                SpecialMissionViewHolder.h(SpecialMissionViewHolder.this, a0Var, (Boolean) obj);
            }
        });
        uVar.g().a(new r() { // from class: com.dena.mirrativ.catalog.mission.SpecialMissionViewHolder$bind$5

            /* loaded from: classes.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f20705a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_RESUME.ordinal()] = 1;
                    iArr[o.b.ON_DESTROY.ordinal()] = 2;
                    iArr[o.b.ON_PAUSE.ordinal()] = 3;
                    f20705a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar2, o.b bVar) {
                Player player;
                Player player2;
                p.h(uVar2, "source");
                p.h(bVar, "event");
                int i10 = a.f20705a[bVar.ordinal()];
                if (i10 == 1) {
                    if (!p.c(a0.this.g().f(), Boolean.TRUE) || (player = this.i().I.getPlayer()) == null) {
                        return;
                    }
                    player.setPlayWhenReady(true);
                } else if (i10 != 2) {
                    if (i10 == 3 && (player2 = this.i().I.getPlayer()) != null) {
                        player2.setPlayWhenReady(false);
                    }
                } else {
                    Player player3 = this.i().I.getPlayer();
                    if (player3 != null) {
                        player3.release();
                    }
                }
            }
        });
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final a2 i() {
        return this.f20698w;
    }

    public final MRLogger j() {
        return (MRLogger) this.f20699x.getValue();
    }

    public final SimpleCache k() {
        return (SimpleCache) this.f20700y.getValue();
    }

    public final void l(a0 a0Var) {
        of.n.r(this.itemView.getContext(), a0Var.b());
        MRLogger j10 = j();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_DAILY_MISSION_INSTALL_BUTTON_TAP);
        builder.setTargetId(String.valueOf(a0Var.d()));
        builder.setPayload(xn.r.d(wn.q.a("url", a0Var.b())));
        j10.sendLog(builder.build());
    }

    public final void m(String str) {
        SimpleExoPlayer simpleExoPlayer = this.f20701z;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.stop();
            simpleExoPlayer.release();
            this.f20701z = null;
        }
        ProgressiveMediaSource createMediaSource = new ProgressiveMediaSource.Factory(new CacheDataSourceFactory(k(), new DefaultDataSourceFactory(this.itemView.getContext(), ApiUtil.INSTANCE.userAgent()), 3)).createMediaSource(Uri.parse(str));
        p.g(createMediaSource, "Factory(cachedFactory).c…urce(Uri.parse(videoUrl))");
        SimpleExoPlayer build = new SimpleExoPlayer.Builder(this.itemView.getContext()).build();
        p.g(build, "Builder(itemView.context).build()");
        build.setVolume(0.3f);
        build.setPlayWhenReady(true);
        build.prepare(createMediaSource);
        this.f20698w.G.setVisibility(0);
        this.f20698w.K.setVisibility(0);
        this.f20698w.F.setVisibility(8);
        this.f20698w.E.setVisibility(8);
        build.addListener(new c());
        build.addVideoListener(new d());
        this.f20698w.I.setOutlineProvider(new e());
        this.f20698w.I.setClipToOutline(true);
        this.f20698w.I.setPlayer(build);
        this.f20701z = build;
    }
}
