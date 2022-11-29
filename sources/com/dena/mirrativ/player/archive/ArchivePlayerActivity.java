package com.dena.mirrativ.player.archive;

import ae.i7;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Size;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.PopupMenu;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import ce.y;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.player.archive.ArchivePlayerActivity;
import com.dena.mirrativ.player.archive.ArchivePlayerService;
import com.dena.mirrorman.activity.MainActivity;
import com.dena.mirrorman.clientlog.logs.Live;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.MirroringResponse;
import com.dena.mirrorman.net.api.response.live.LiveTimeline;
import com.dena.mirrorman.net.glide.GlideApp;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.SimpleExoPlayer;
import hb.b2;
import hb.r1;
import hb.u1;
import hb.v1;
import hb.w1;
import hb.x1;
import hb.y1;
import hb.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jo.e0;
import jo.i0;
import jo.p;
import kq.a;
import nd.i1;
import sf.i;
import tb.c;
import uo.b1;
import uo.d2;
import uo.q0;
import uo.r0;
import wn.v;
import yd.g1;
import yd.t1;

/* loaded from: classes2.dex */
public final class ArchivePlayerActivity extends e.b implements TextureView.SurfaceTextureListener, q0 {

    /* renamed from: a0  reason: collision with root package name */
    public static final a f22590a0 = new a(null);

    /* renamed from: b0  reason: collision with root package name */
    public static final int f22591b0 = 8;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f22592c0;
    public kb.a P;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final h V;
    public ArchivePlayerService W;
    public long X;
    public Surface Y;
    public PopupMenu Z;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f Q = wn.g.a(new c());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            Intent intent = new Intent(context, ArchivePlayerActivity.class);
            intent.putExtra("EXTRA_LIVE_ID", str);
            intent.addFlags(67108864);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements f0<te.c> {

        /* loaded from: classes2.dex */
        public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ArchivePlayerActivity f22594w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ te.c f22595x;

            public a(ArchivePlayerActivity archivePlayerActivity, te.c cVar) {
                this.f22594w = archivePlayerActivity;
                this.f22595x = cVar;
            }

            public static final void b(ArchivePlayerActivity archivePlayerActivity, wn.k kVar, View view) {
                jo.p.h(archivePlayerActivity, "this$0");
                jo.p.h(kVar, "$timeFromStartAndApp");
                ArchivePlayerService archivePlayerService = archivePlayerActivity.W;
                if (archivePlayerService != null) {
                    archivePlayerService.E(((Number) kVar.c()).longValue() * 1000);
                }
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                List<LiveTimeline> timeline;
                ArchivePlayerService archivePlayerService = this.f22594w.W;
                if (archivePlayerService == null) {
                    return;
                }
                kb.a aVar = this.f22594w.P;
                ViewGroup viewGroup = null;
                if (aVar == null) {
                    jo.p.v("binding");
                    aVar = null;
                }
                if (aVar.R.getMeasuredWidth() == 0) {
                    return;
                }
                kb.a aVar2 = this.f22594w.P;
                if (aVar2 == null) {
                    jo.p.v("binding");
                    aVar2 = null;
                }
                aVar2.R.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                kb.a aVar3 = this.f22594w.P;
                if (aVar3 == null) {
                    jo.p.v("binding");
                    aVar3 = null;
                }
                int measuredWidth = aVar3.R.getMeasuredWidth();
                kb.a aVar4 = this.f22594w.P;
                if (aVar4 == null) {
                    jo.p.v("binding");
                    aVar4 = null;
                }
                int thumbOffset = measuredWidth - (aVar4.R.getThumbOffset() * 2);
                kb.a aVar5 = this.f22594w.P;
                if (aVar5 == null) {
                    jo.p.v("binding");
                    aVar5 = null;
                }
                int left = aVar5.R.getLeft();
                kb.a aVar6 = this.f22594w.P;
                if (aVar6 == null) {
                    jo.p.v("binding");
                    aVar6 = null;
                }
                int thumbOffset2 = left + aVar6.R.getThumbOffset();
                long v10 = archivePlayerService.v() / 1000;
                te.c f10 = this.f22594w.a4().i().f();
                if (f10 == null || (timeline = f10.getTimeline()) == null) {
                    return;
                }
                ArrayList<LiveTimeline> arrayList = new ArrayList();
                Iterator<T> it = timeline.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((LiveTimeline) next).getApp() != null) {
                        arrayList.add(next);
                    }
                }
                te.c cVar = this.f22595x;
                ArrayList<wn.k> arrayList2 = new ArrayList(xn.t.u(arrayList, 10));
                for (LiveTimeline liveTimeline : arrayList) {
                    long timestamp = liveTimeline.getTimestamp() - cVar.getStartedAt();
                    if (timestamp < 0) {
                        timestamp = 0;
                    }
                    Long valueOf = Long.valueOf(timestamp);
                    App.AppParams app = liveTimeline.getApp();
                    jo.p.e(app);
                    arrayList2.add(new wn.k(valueOf, app));
                }
                final ArchivePlayerActivity archivePlayerActivity = this.f22594w;
                for (final wn.k kVar : arrayList2) {
                    float longValue = ((float) ((Number) kVar.c()).longValue()) / ((float) v10);
                    if (longValue <= 1.0f) {
                        int dimensionPixelSize = archivePlayerActivity.getResources().getDimensionPixelSize(u1.archive_player_app_balloon_width);
                        int dimensionPixelSize2 = archivePlayerActivity.getResources().getDimensionPixelSize(u1.archive_player_app_balloon_height);
                        i7 i7Var = (i7) androidx.databinding.f.e(archivePlayerActivity.getLayoutInflater(), x1.f35035l, viewGroup, false);
                        GlideApp.with((androidx.fragment.app.h) archivePlayerActivity).load(((App.AppParams) kVar.d()).getIconUrl()).circleCrop().into(i7Var.C);
                        i7Var.B.setOnClickListener(new View.OnClickListener() { // from class: jb.o
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ArchivePlayerActivity.b.a.b(ArchivePlayerActivity.this, kVar, view);
                            }
                        });
                        int c10 = (thumbOffset2 - (dimensionPixelSize / 2)) + lo.c.c(thumbOffset * longValue);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2, 48);
                        layoutParams.setMargins(c10, 0, 0, 0);
                        kb.a aVar7 = archivePlayerActivity.P;
                        if (aVar7 == null) {
                            jo.p.v("binding");
                            aVar7 = null;
                        }
                        aVar7.D.addView(i7Var.u(), layoutParams);
                        viewGroup = null;
                    }
                }
            }
        }

        public b() {
        }

        @Override // androidx.lifecycle.f0
        /* renamed from: a */
        public void d(te.c cVar) {
            if (cVar == null) {
                return;
            }
            ArchivePlayerActivity.this.a4().i().n(this);
            kb.a aVar = ArchivePlayerActivity.this.P;
            if (aVar == null) {
                jo.p.v("binding");
                aVar = null;
            }
            aVar.R.getViewTreeObserver().addOnGlobalLayoutListener(new a(ArchivePlayerActivity.this, cVar));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = ArchivePlayerActivity.this.getIntent().getStringExtra("EXTRA_LIVE_ID");
            jo.p.e(stringExtra);
            return stringExtra;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.archive.ArchivePlayerActivity$observeStoreValues$3", f = "ArchivePlayerActivity.kt", l = {726}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22597w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22598x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22599y;

        /* renamed from: z  reason: collision with root package name */
        public int f22600z;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0067, B:25:0x008a, B:27:0x0090, B:29:0x0097, B:21:0x0073, B:23:0x0077, B:24:0x007b), top: B:40:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:40:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r11.f22600z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r11.f22599y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r11.f22598x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r11.f22597w
                com.dena.mirrativ.player.archive.ArchivePlayerActivity r4 = (com.dena.mirrativ.player.archive.ArchivePlayerActivity) r4
                wn.m.b(r12)     // Catch: java.lang.Throwable -> Lab
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L53
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                wn.m.b(r12)
                com.dena.mirrativ.player.archive.ArchivePlayerActivity r12 = com.dena.mirrativ.player.archive.ArchivePlayerActivity.this
                jb.q r12 = com.dena.mirrativ.player.archive.ArchivePlayerActivity.M3(r12)
                wo.x r3 = r12.h()
                com.dena.mirrativ.player.archive.ArchivePlayerActivity r12 = com.dena.mirrativ.player.archive.ArchivePlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lab
                r4 = r12
                r12 = r11
            L3d:
                r12.f22597w = r4     // Catch: java.lang.Throwable -> Lab
                r12.f22598x = r3     // Catch: java.lang.Throwable -> Lab
                r12.f22599y = r1     // Catch: java.lang.Throwable -> Lab
                r12.f22600z = r2     // Catch: java.lang.Throwable -> Lab
                java.lang.Object r5 = r1.a(r12)     // Catch: java.lang.Throwable -> Lab
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r10 = r0
                r0 = r12
                r12 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r10
            L53:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> La8
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> La8
                r6 = 0
                if (r12 == 0) goto La2
                java.lang.Object r12 = r3.next()     // Catch: java.lang.Throwable -> La8
                com.dena.mirrativ.mirrativapi.core.MRError r12 = (com.dena.mirrativ.mirrativapi.core.MRError) r12     // Catch: java.lang.Throwable -> La8
                boolean r7 = r12 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> La8
                r8 = 0
                if (r7 == 0) goto L73
                of.n r7 = of.n.f45411a     // Catch: java.lang.Throwable -> La8
                com.dena.mirrativ.mirrativapi.core.MRError$Failure r12 = (com.dena.mirrativ.mirrativapi.core.MRError.Failure) r12     // Catch: java.lang.Throwable -> La8
                java.lang.String r12 = r12.getErrorMessage()     // Catch: java.lang.Throwable -> La8
                r7.B(r5, r12, r8)     // Catch: java.lang.Throwable -> La8
                goto L8a
            L73:
                boolean r12 = r12 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> La8
                if (r12 == 0) goto L7b
                of.n.z(r5)     // Catch: java.lang.Throwable -> La8
                goto L8a
            L7b:
                of.n r12 = of.n.f45411a     // Catch: java.lang.Throwable -> La8
                android.content.res.Resources r7 = r5.getResources()     // Catch: java.lang.Throwable -> La8
                int r9 = hb.b2.f34715b     // Catch: java.lang.Throwable -> La8
                java.lang.String r7 = r7.getString(r9)     // Catch: java.lang.Throwable -> La8
                r12.B(r5, r7, r8)     // Catch: java.lang.Throwable -> La8
            L8a:
                kb.a r12 = com.dena.mirrativ.player.archive.ArchivePlayerActivity.N3(r5)     // Catch: java.lang.Throwable -> La8
                if (r12 != 0) goto L96
                java.lang.String r12 = "binding"
                jo.p.v(r12)     // Catch: java.lang.Throwable -> La8
                goto L97
            L96:
                r6 = r12
            L97:
                androidx.appcompat.widget.AppCompatButton r12 = r6.Q     // Catch: java.lang.Throwable -> La8
                r12.setVisibility(r8)     // Catch: java.lang.Throwable -> La8
                r12 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            La2:
                wo.n.a(r4, r6)
                wn.v r12 = wn.v.f59242a
                return r12
            La8:
                r12 = move-exception
                r3 = r4
                goto Lac
            Lab:
                r12 = move-exception
            Lac:
                throw r12     // Catch: java.lang.Throwable -> Lad
            Lad:
                r0 = move-exception
                wo.n.a(r3, r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.archive.ArchivePlayerActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.archive.ArchivePlayerActivity$observeStoreValues$4", f = "ArchivePlayerActivity.kt", l = {726}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f22601w;

        /* renamed from: x  reason: collision with root package name */
        public Object f22602x;

        /* renamed from: y  reason: collision with root package name */
        public Object f22603y;

        /* renamed from: z  reason: collision with root package name */
        public int f22604z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0067, B:22:0x0073, B:24:0x0077, B:25:0x0083, B:27:0x0087, B:28:0x0093), top: B:39:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f22604z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f22603y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f22602x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f22601w
                com.dena.mirrativ.player.archive.ArchivePlayerActivity r4 = (com.dena.mirrativ.player.archive.ArchivePlayerActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> Lab
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.player.archive.ArchivePlayerActivity r10 = com.dena.mirrativ.player.archive.ArchivePlayerActivity.this
                jb.q r10 = com.dena.mirrativ.player.archive.ArchivePlayerActivity.M3(r10)
                wo.x r3 = r10.g()
                com.dena.mirrativ.player.archive.ArchivePlayerActivity r10 = com.dena.mirrativ.player.archive.ArchivePlayerActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lab
                r4 = r10
                r10 = r9
            L3d:
                r10.f22601w = r4     // Catch: java.lang.Throwable -> Lab
                r10.f22602x = r3     // Catch: java.lang.Throwable -> Lab
                r10.f22603y = r1     // Catch: java.lang.Throwable -> Lab
                r10.f22604z = r2     // Catch: java.lang.Throwable -> Lab
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> Lab
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La8
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La8
                if (r10 == 0) goto La2
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> La8
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> La8
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> La8
                r7 = 0
                if (r6 == 0) goto L73
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La8
                com.dena.mirrativ.mirrativapi.core.MRError$Failure r10 = (com.dena.mirrativ.mirrativapi.core.MRError.Failure) r10     // Catch: java.lang.Throwable -> La8
                java.lang.String r10 = r10.getErrorMessage()     // Catch: java.lang.Throwable -> La8
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> La8
                goto L9c
            L73:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> La8
                if (r6 == 0) goto L83
                of.n r10 = of.n.f45411a     // Catch: java.lang.Throwable -> La8
                int r6 = hb.b2.f34715b     // Catch: java.lang.Throwable -> La8
                java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> La8
                r10.B(r5, r6, r7)     // Catch: java.lang.Throwable -> La8
                goto L9c
            L83:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> La8
                if (r6 == 0) goto L93
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La8
                com.dena.mirrativ.mirrativapi.core.MRError$Blocked r10 = (com.dena.mirrativ.mirrativapi.core.MRError.Blocked) r10     // Catch: java.lang.Throwable -> La8
                java.lang.String r10 = r10.getErrorMessage()     // Catch: java.lang.Throwable -> La8
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> La8
                goto L9c
            L93:
                java.lang.String r6 = "ArchivePlayerActivity"
                java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> La8
                android.util.Log.i(r6, r10)     // Catch: java.lang.Throwable -> La8
            L9c:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            La2:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            La8:
                r10 = move-exception
                r3 = r4
                goto Lac
            Lab:
                r10 = move-exception
            Lac:
                throw r10     // Catch: java.lang.Throwable -> Lad
            Lad:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.player.archive.ArchivePlayerActivity.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements f0<te.a> {
        public f() {
        }

        @Override // androidx.lifecycle.f0
        /* renamed from: a */
        public void d(te.a aVar) {
            boolean z10 = true;
            if (aVar == null || !aVar.i()) {
                z10 = false;
            }
            if (z10) {
                ArchivePlayerActivity.this.X3();
                ArchivePlayerActivity.this.a4().k().n(this);
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.player.archive.ArchivePlayerActivity$onCreate$1", f = "ArchivePlayerActivity.kt", l = {168, 177}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22606w;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f22606w;
            if (i10 != 0 && i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wn.m.b(obj);
            while (ArchivePlayerActivity.this.g().b() != o.c.DESTROYED) {
                ArchivePlayerService archivePlayerService = ArchivePlayerActivity.this.W;
                if (archivePlayerService == null) {
                    this.f22606w = 1;
                    if (b1.a(200L, this) == c10) {
                        return c10;
                    }
                } else {
                    long u10 = archivePlayerService.u();
                    int v10 = (int) archivePlayerService.v();
                    kb.a aVar = ArchivePlayerActivity.this.P;
                    kb.a aVar2 = null;
                    if (aVar == null) {
                        jo.p.v("binding");
                        aVar = null;
                    }
                    aVar.R.setMax(v10);
                    ArchivePlayerActivity archivePlayerActivity = ArchivePlayerActivity.this;
                    kb.a aVar3 = archivePlayerActivity.P;
                    if (aVar3 == null) {
                        jo.p.v("binding");
                        aVar3 = null;
                    }
                    AppCompatTextView appCompatTextView = aVar3.J;
                    jo.p.g(appCompatTextView, "binding.fullDurationOnControllerTextView");
                    archivePlayerActivity.k4(appCompatTextView, v10);
                    kb.a aVar4 = ArchivePlayerActivity.this.P;
                    if (aVar4 == null) {
                        jo.p.v("binding");
                        aVar4 = null;
                    }
                    int i11 = (int) u10;
                    aVar4.R.setProgress(i11);
                    ArchivePlayerActivity archivePlayerActivity2 = ArchivePlayerActivity.this;
                    kb.a aVar5 = archivePlayerActivity2.P;
                    if (aVar5 == null) {
                        jo.p.v("binding");
                    } else {
                        aVar2 = aVar5;
                    }
                    AppCompatTextView appCompatTextView2 = aVar2.H;
                    jo.p.g(appCompatTextView2, "binding.currentProgressOnControllerTextView");
                    archivePlayerActivity2.k4(appCompatTextView2, i11);
                    this.f22606w = 2;
                    if (b1.a(200L, this) == c10) {
                        return c10;
                    }
                }
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements ServiceConnection {
        public h() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ArchivePlayerService archivePlayerService;
            ArchivePlayerService archivePlayerService2;
            jo.p.h(componentName, "name");
            jo.p.h(iBinder, "binder");
            ArchivePlayerActivity archivePlayerActivity = ArchivePlayerActivity.this;
            mf.a aVar = iBinder instanceof mf.a ? (mf.a) iBinder : null;
            Object a10 = aVar != null ? aVar.a() : null;
            archivePlayerActivity.W = a10 instanceof ArchivePlayerService ? (ArchivePlayerService) a10 : null;
            Surface surface = ArchivePlayerActivity.this.Y;
            if (surface != null && (archivePlayerService2 = ArchivePlayerActivity.this.W) != null) {
                archivePlayerService2.L(surface);
            }
            if (ArchivePlayerActivity.this.g().b() != o.c.RESUMED || (archivePlayerService = ArchivePlayerActivity.this.W) == null) {
                return;
            }
            archivePlayerService.r();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            jo.p.h(componentName, "name");
            ArchivePlayerActivity.this.unbindService(this);
            ArchivePlayerActivity.this.W = null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends BroadcastReceiver {
        public i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            jo.p.h(context, "context");
            jo.p.h(intent, "intent");
            if (jo.p.c("com.dena.mirrorman.action.STOP_PLAYING", intent.getAction())) {
                ArchivePlayerActivity.this.finish();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e0<d2> f22611x;

        /* loaded from: classes2.dex */
        public static final class a implements sf.i {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Animator f22612a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e0<d2> f22613b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ ArchivePlayerActivity f22614c;

            public a(Animator animator, e0<d2> e0Var, ArchivePlayerActivity archivePlayerActivity) {
                this.f22612a = animator;
                this.f22613b = e0Var;
                this.f22614c = archivePlayerActivity;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                i.a.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ArchivePlayerActivity.v4(this.f22613b, this.f22614c);
                this.f22612a.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                i.a.c(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                i.a.d(this, animator);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e0<d2> e0Var) {
            super(1);
            this.f22611x = e0Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            kb.a aVar = ArchivePlayerActivity.this.P;
            kb.a aVar2 = null;
            if (aVar == null) {
                jo.p.v("binding");
                aVar = null;
            }
            aVar.F.setVisibility(0);
            Animator loadAnimator = AnimatorInflater.loadAnimator(ArchivePlayerActivity.this, r1.archive_player_controller_anim_show);
            ArchivePlayerActivity archivePlayerActivity = ArchivePlayerActivity.this;
            e0<d2> e0Var = this.f22611x;
            kb.a aVar3 = archivePlayerActivity.P;
            if (aVar3 == null) {
                jo.p.v("binding");
            } else {
                aVar2 = aVar3;
            }
            loadAnimator.setTarget(aVar2.F);
            loadAnimator.addListener(new a(loadAnimator, e0Var, archivePlayerActivity));
            loadAnimator.start();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e0<d2> f22616x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(e0<d2> e0Var) {
            super(1);
            this.f22616x = e0Var;
        }

        public static final void c(ArchivePlayerActivity archivePlayerActivity, e0 e0Var, PopupMenu popupMenu) {
            jo.p.h(archivePlayerActivity, "this$0");
            jo.p.h(e0Var, "$hideControllerJob");
            ArchivePlayerActivity.v4(e0Var, archivePlayerActivity);
            archivePlayerActivity.Z = null;
        }

        public final void b(View view) {
            jo.p.h(view, "it");
            if (ArchivePlayerActivity.this.Z == null) {
                d2.a.a(this.f22616x.f38136w, null, 1, null);
                ArchivePlayerActivity archivePlayerActivity = ArchivePlayerActivity.this;
                PopupMenu V3 = archivePlayerActivity.V3();
                final ArchivePlayerActivity archivePlayerActivity2 = ArchivePlayerActivity.this;
                final e0<d2> e0Var = this.f22616x;
                V3.setOnDismissListener(new PopupMenu.OnDismissListener() { // from class: jb.p
                    @Override // androidx.appcompat.widget.PopupMenu.OnDismissListener
                    public final void onDismiss(PopupMenu popupMenu) {
                        ArchivePlayerActivity.k.c(ArchivePlayerActivity.this, e0Var, popupMenu);
                    }
                });
                V3.show();
                archivePlayerActivity.Z = V3;
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            b(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e0<d2> f22618b;

        public l(e0<d2> e0Var) {
            this.f22618b = e0Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            ArchivePlayerService archivePlayerService;
            if (!z10 || (archivePlayerService = ArchivePlayerActivity.this.W) == null) {
                return;
            }
            archivePlayerService.E(i10);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            d2.a.a(this.f22618b.f38136w, null, 1, null);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ArchivePlayerActivity.v4(this.f22618b, ArchivePlayerActivity.this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConstraintLayout f22619a;

        public m(ConstraintLayout constraintLayout) {
            this.f22619a = constraintLayout;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            jo.p.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            jo.p.h(animator, "animator");
            this.f22619a.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            jo.p.h(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            jo.p.h(animator, "animator");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.archive.ArchivePlayerActivity$setupViews$hideControllerJob$1", f = "ArchivePlayerActivity.kt", l = {506}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22620w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f22621x;

        public n(ao.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            n nVar = new n(dVar);
            nVar.f22621x = obj;
            return nVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((n) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q0 q0Var;
            Object c10 = bo.c.c();
            int i10 = this.f22620w;
            if (i10 == 0) {
                wn.m.b(obj);
                q0 q0Var2 = (q0) this.f22621x;
                this.f22621x = q0Var2;
                this.f22620w = 1;
                if (b1.a(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, this) == c10) {
                    return c10;
                }
                q0Var = q0Var2;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                q0Var = (q0) this.f22621x;
                wn.m.b(obj);
            }
            if (r0.g(q0Var)) {
                ArchivePlayerActivity.n4(ArchivePlayerActivity.this);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.archive.ArchivePlayerActivity$setupViews$resetHideControllerJob$1", f = "ArchivePlayerActivity.kt", l = {513}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f22623w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f22624x;

        public o(ao.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            o oVar = new o(dVar);
            oVar.f22624x = obj;
            return oVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            q0 q0Var;
            Object c10 = bo.c.c();
            int i10 = this.f22623w;
            if (i10 == 0) {
                wn.m.b(obj);
                q0 q0Var2 = (q0) this.f22624x;
                this.f22624x = q0Var2;
                this.f22623w = 1;
                if (b1.a(2500L, this) == c10) {
                    return c10;
                }
                q0Var = q0Var2;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                q0Var = (q0) this.f22624x;
                wn.m.b(obj);
            }
            if (r0.g(q0Var)) {
                ArchivePlayerActivity.n4(ArchivePlayerActivity.this);
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<jb.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22626w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22627x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22628y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22626w = componentCallbacks;
            this.f22627x = aVar;
            this.f22628y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jb.a] */
        @Override // io.a
        public final jb.a invoke() {
            ComponentCallbacks componentCallbacks = this.f22626w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(jb.a.class), this.f22627x, this.f22628y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22629w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22630x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22631y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22629w = componentCallbacks;
            this.f22630x = aVar;
            this.f22631y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f22629w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i1.class), this.f22630x, this.f22631y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f22632w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22633x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22634y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f22632w = componentCallbacks;
            this.f22633x = aVar;
            this.f22634y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f22632w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f22633x, this.f22634y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f22635w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentActivity componentActivity) {
            super(0);
            this.f22635w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f22635w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f22638w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f22639x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f22640y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f22641z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f22638w = aVar;
            this.f22639x = aVar2;
            this.f22640y = aVar3;
            this.f22641z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f22638w;
            vq.a aVar2 = this.f22639x;
            io.a aVar3 = this.f22640y;
            xq.a aVar4 = this.f22641z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(jb.q.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f22642w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentActivity componentActivity) {
            super(0);
            this.f22642w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f22642w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    static {
        f22592c0 = of.n.n() ? 5 : 60;
    }

    public ArchivePlayerActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.R = wn.g.b(iVar, new p(this, null, null));
        this.S = new s0(jo.f0.b(jb.q.class), new u(this), new t(new s(this), null, null, gq.a.a(this)));
        this.T = wn.g.b(iVar, new q(this, null, null));
        this.U = wn.g.b(iVar, new r(this, null, null));
        this.V = new h();
    }

    public static final boolean W3(ArchivePlayerActivity archivePlayerActivity, MenuItem menuItem) {
        float f10;
        jo.p.h(archivePlayerActivity, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == w1.menu_item_speed_2x) {
            f10 = 2.0f;
        } else if (itemId == w1.menu_item_speed_1_point_5x) {
            f10 = 1.5f;
        } else {
            f10 = itemId == w1.menu_item_speed_1_point_25x ? 1.25f : 1.0f;
        }
        archivePlayerActivity.Z3().f(f10);
        return true;
    }

    public static final void g4(ArchivePlayerActivity archivePlayerActivity, Boolean bool) {
        jo.p.h(archivePlayerActivity, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        kb.a aVar = archivePlayerActivity.P;
        if (aVar == null) {
            jo.p.v("binding");
            aVar = null;
        }
        aVar.K.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    public static final void h4(ArchivePlayerActivity archivePlayerActivity, te.c cVar) {
        String string;
        jo.p.h(archivePlayerActivity, "this$0");
        if (cVar == null) {
            return;
        }
        if (archivePlayerActivity.d4().a().d()) {
            MirroringResponse mirroring = cVar.getMirroring();
            boolean z10 = true;
            if (mirroring == null || !mirroring.getEnabled()) {
                z10 = false;
            }
            if (!z10) {
                of.n nVar = of.n.f45411a;
                MirroringResponse mirroring2 = cVar.getMirroring();
                if (mirroring2 == null || (string = mirroring2.getReason()) == null) {
                    string = archivePlayerActivity.getString(b2.f34726q);
                    jo.p.g(string, "getString(R.string.text_…_play_while_broadcasting)");
                }
                nVar.B(archivePlayerActivity, string, false);
                archivePlayerActivity.finish();
            }
        }
        if (cVar.j() == null) {
            t1.a aVar = t1.f61795x;
            String string2 = archivePlayerActivity.getString(b2.f34716d);
            jo.p.g(string2, "getString(R.string.error_unable)");
            aVar.a(archivePlayerActivity, string2);
            archivePlayerActivity.finish();
            return;
        }
        archivePlayerActivity.w4();
        kb.a aVar2 = archivePlayerActivity.P;
        kb.a aVar3 = null;
        if (aVar2 == null) {
            jo.p.v("binding");
            aVar2 = null;
        }
        AppCompatImageView appCompatImageView = aVar2.L;
        jo.p.g(appCompatImageView, "binding.ownerIconImageView");
        de.f.e(appCompatImageView, cVar.f(), Integer.valueOf(v1.S));
        kb.a aVar4 = archivePlayerActivity.P;
        if (aVar4 == null) {
            jo.p.v("binding");
        } else {
            aVar3 = aVar4;
        }
        aVar3.M.setText(cVar.e());
    }

    public static final void i4(ArchivePlayerActivity archivePlayerActivity, te.a aVar) {
        jo.p.h(archivePlayerActivity, "this$0");
        jo.p.g(aVar, "it");
        archivePlayerActivity.x4(aVar);
    }

    public static final void j4(ArchivePlayerActivity archivePlayerActivity, Float f10) {
        jo.p.h(archivePlayerActivity, "this$0");
        jo.p.g(f10, "speed");
        PlaybackParameters playbackParameters = new PlaybackParameters(f10.floatValue());
        kb.a aVar = archivePlayerActivity.P;
        if (aVar == null) {
            jo.p.v("binding");
            aVar = null;
        }
        aVar.G.setText(archivePlayerActivity.Y3(f10.floatValue()));
        ArchivePlayerService archivePlayerService = archivePlayerActivity.W;
        if (archivePlayerService != null) {
            archivePlayerService.K(playbackParameters);
        }
    }

    public static final void n4(ArchivePlayerActivity archivePlayerActivity) {
        kb.a aVar = archivePlayerActivity.P;
        if (aVar == null) {
            jo.p.v("binding");
            aVar = null;
        }
        ConstraintLayout constraintLayout = aVar.F;
        Animator loadAnimator = AnimatorInflater.loadAnimator(archivePlayerActivity, r1.archive_player_controller_anim_hide);
        loadAnimator.setTarget(constraintLayout);
        jo.p.g(loadAnimator, "");
        loadAnimator.addListener(new m(constraintLayout));
        loadAnimator.start();
    }

    public static final void o4(ArchivePlayerActivity archivePlayerActivity, View view) {
        jo.p.h(archivePlayerActivity, "this$0");
        if (archivePlayerActivity.a4().i().f() == null) {
            jb.a Z3 = archivePlayerActivity.Z3();
            String c42 = archivePlayerActivity.c4();
            jo.p.g(c42, "liveId");
            Z3.d(c42);
            return;
        }
        ArchivePlayerService archivePlayerService = archivePlayerActivity.W;
        if (archivePlayerService != null) {
            archivePlayerService.D();
        }
        kb.a aVar = archivePlayerActivity.P;
        if (aVar == null) {
            jo.p.v("binding");
            aVar = null;
        }
        aVar.Q.setVisibility(8);
    }

    public static final void p4(ArchivePlayerActivity archivePlayerActivity, View view) {
        jo.p.h(archivePlayerActivity, "this$0");
        archivePlayerActivity.finish();
    }

    public static final void q4(e0 e0Var, ArchivePlayerActivity archivePlayerActivity, View view) {
        jo.p.h(e0Var, "$hideControllerJob");
        jo.p.h(archivePlayerActivity, "this$0");
        d2.a.a((d2) e0Var.f38136w, null, 1, null);
        n4(archivePlayerActivity);
    }

    public static final void r4(ArchivePlayerActivity archivePlayerActivity, e0 e0Var, View view) {
        jo.p.h(archivePlayerActivity, "this$0");
        jo.p.h(e0Var, "$hideControllerJob");
        v4(e0Var, archivePlayerActivity);
        ArchivePlayerService archivePlayerService = archivePlayerActivity.W;
        if (archivePlayerService == null) {
            return;
        }
        te.a f10 = archivePlayerActivity.a4().k().f();
        boolean z10 = true;
        if (f10 == null || !f10.i()) {
            z10 = false;
        }
        if (z10) {
            archivePlayerService.A();
        } else {
            archivePlayerService.N();
        }
    }

    public static final void s4(ArchivePlayerActivity archivePlayerActivity, e0 e0Var, View view) {
        jo.p.h(archivePlayerActivity, "this$0");
        jo.p.h(e0Var, "$hideControllerJob");
        kb.a aVar = archivePlayerActivity.P;
        if (aVar == null) {
            jo.p.v("binding");
            aVar = null;
        }
        aVar.C.r();
        v4(e0Var, archivePlayerActivity);
        ArchivePlayerService archivePlayerService = archivePlayerActivity.W;
        if (archivePlayerService != null) {
            long u10 = archivePlayerService.u() - 10000;
            if (u10 <= 0) {
                u10 = 0;
            }
            ArchivePlayerService archivePlayerService2 = archivePlayerActivity.W;
            if (archivePlayerService2 != null) {
                archivePlayerService2.E(u10);
            }
        }
    }

    public static final void t4(ArchivePlayerActivity archivePlayerActivity, e0 e0Var, View view) {
        jo.p.h(archivePlayerActivity, "this$0");
        jo.p.h(e0Var, "$hideControllerJob");
        kb.a aVar = archivePlayerActivity.P;
        if (aVar == null) {
            jo.p.v("binding");
            aVar = null;
        }
        aVar.I.r();
        v4(e0Var, archivePlayerActivity);
        ArchivePlayerService archivePlayerService = archivePlayerActivity.W;
        if (archivePlayerService != null) {
            long u10 = archivePlayerService.u();
            long j10 = 10000 + u10;
            ArchivePlayerService archivePlayerService2 = archivePlayerActivity.W;
            if (j10 > (archivePlayerService2 != null ? archivePlayerService2.v() : 0L)) {
                ArchivePlayerService archivePlayerService3 = archivePlayerActivity.W;
                if (archivePlayerService3 != null) {
                    u10 = archivePlayerService3.v();
                }
            } else {
                u10 = j10;
            }
            ArchivePlayerService archivePlayerService4 = archivePlayerActivity.W;
            if (archivePlayerService4 != null) {
                archivePlayerService4.E(u10);
            }
        }
    }

    public static final void u4(ArchivePlayerActivity archivePlayerActivity, e0 e0Var, View view) {
        String g10;
        jo.p.h(archivePlayerActivity, "this$0");
        jo.p.h(e0Var, "$hideControllerJob");
        te.c f10 = archivePlayerActivity.a4().i().f();
        if (f10 == null || (g10 = f10.g()) == null) {
            return;
        }
        d2.a.a((d2) e0Var.f38136w, null, 1, null);
        n4(archivePlayerActivity);
        tb.a i10 = c.a.i(archivePlayerActivity.b4(), g10, Referer.ARCHIVE_VIEW, false, false, 12, null);
        i10.a().z3(archivePlayerActivity.a3(), i10.b());
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [uo.d2, T] */
    public static final void v4(e0<d2> e0Var, ArchivePlayerActivity archivePlayerActivity) {
        ?? d10;
        d2.a.a(e0Var.f38136w, null, 1, null);
        d10 = uo.l.d(archivePlayerActivity, null, null, new o(null), 3, null);
        e0Var.f38136w = d10;
    }

    public final PopupMenu V3() {
        kb.a aVar = this.P;
        if (aVar == null) {
            jo.p.v("binding");
            aVar = null;
        }
        PopupMenu popupMenu = new PopupMenu(this, aVar.O, 8388613);
        popupMenu.getMenuInflater().inflate(y1.popup_playback_speed_menu, popupMenu.getMenu());
        int i10 = 1;
        popupMenu.setForceShowIcon(true);
        Float f10 = a4().j().f();
        if (!jo.p.a(f10, 2.0f)) {
            if (jo.p.a(f10, 1.5f)) {
                i10 = 2;
            } else {
                i10 = jo.p.a(f10, 1.25f) ? 3 : 4;
            }
        }
        Menu menu = popupMenu.getMenu();
        jo.p.g(menu, "menu");
        int size = menu.size();
        if (size > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                MenuItem item = menu.getItem(i11);
                jo.p.g(item, "getItem(index)");
                SpannableString spannableString = new SpannableString(item.getTitle());
                if (i11 == 0) {
                    spannableString.setSpan(new ForegroundColorSpan(c3.a.d(this, hb.t1.f34966d)), 0, spannableString.length(), 0);
                    spannableString.setSpan(new RelativeSizeSpan(0.75f), 0, spannableString.length(), 0);
                    spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, spannableString.length(), 0);
                } else {
                    spannableString.setSpan(new ForegroundColorSpan(c3.a.d(this, hb.t1.f34967g)), 0, spannableString.length(), 0);
                    item.getIcon().setAlpha(i10 == i11 ? 255 : 0);
                }
                item.setTitle(spannableString);
                if (i12 >= size) {
                    break;
                }
                i11 = i12;
            }
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: jb.l
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean W3;
                W3 = ArchivePlayerActivity.W3(ArchivePlayerActivity.this, menuItem);
                return W3;
            }
        });
        return popupMenu;
    }

    public final void X3() {
        a4().i().i(this, new b());
    }

    public final String Y3(float f10) {
        int i10;
        if (f10 == 2.0f) {
            i10 = b2.text_video_archive_play_speed_2x;
        } else {
            if (f10 == 1.5f) {
                i10 = b2.text_video_archive_play_speed_1_point_5x;
            } else {
                if (f10 == 1.25f) {
                    i10 = b2.text_video_archive_play_speed_1_point_25x;
                } else {
                    i10 = b2.text_video_archive_play_speed_1x;
                }
            }
        }
        String string = getString(i10);
        jo.p.g(string, "getString(textId)");
        return string;
    }

    public final jb.a Z3() {
        return (jb.a) this.R.getValue();
    }

    public final jb.q a4() {
        return (jb.q) this.S.getValue();
    }

    public final tb.c b4() {
        return (tb.c) this.U.getValue();
    }

    public final String c4() {
        return (String) this.Q.getValue();
    }

    public final i1 d4() {
        return (i1) this.T.getValue();
    }

    public final int e4() {
        Object systemService = getApplicationContext().getSystemService("audio");
        jo.p.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return ((AudioManager) systemService).getStreamVolume(3) > 0 ? 0 : 1;
    }

    public final void f4() {
        a4().l().i(this, new f0() { // from class: jb.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                ArchivePlayerActivity.g4(ArchivePlayerActivity.this, (Boolean) obj);
            }
        });
        a4().i().i(this, new f0() { // from class: jb.n
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                ArchivePlayerActivity.h4(ArchivePlayerActivity.this, (te.c) obj);
            }
        });
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        a4().k().i(this, new f0() { // from class: jb.m
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                ArchivePlayerActivity.i4(ArchivePlayerActivity.this, (te.a) obj);
            }
        });
        a4().k().i(this, new f());
        a4().j().i(this, new f0() { // from class: jb.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                ArchivePlayerActivity.j4(ArchivePlayerActivity.this, (Float) obj);
            }
        });
    }

    @Override // android.app.Activity
    public void finish() {
        ArchivePlayerService archivePlayerService = this.W;
        boolean z10 = (archivePlayerService != null ? archivePlayerService.R() : (System.currentTimeMillis() - this.X) / ((long) 1000)) > ((long) f22592c0) && !jo.p.c(a4().l().f(), Boolean.TRUE);
        te.c f10 = a4().i().f();
        if (f10 != null) {
            String c42 = c4();
            jo.p.g(c42, "liveId");
            oe.a aVar = new oe.a(c42, f10.g(), false, false, 0L, "", null);
            Intent intent = new Intent("actiontype_dialog_afterplay");
            intent.putExtra("EXTRA_LIVE_REQUEST", aVar);
            intent.putExtra("EXTRA_SHOULD_SHOW_LIVE_REQUEST", z10);
            v vVar = v.f59242a;
            setResult(-1, intent);
        }
        if (getIntent().getBooleanExtra("EXTRA_FROM_NOTIFICATION", false)) {
            Intent intent2 = new Intent(this, MainActivity.class);
            intent2.addFlags(67108864);
            if (z10) {
                intent2.setAction("actiontype_dialog_afterplay");
                te.c f11 = a4().i().f();
                if (f11 != null) {
                    String c43 = c4();
                    jo.p.g(c43, "liveId");
                    intent2.putExtra("EXTRA_LIVE_REQUEST", new oe.a(c43, f11.g(), false, false, 0L, "", null));
                }
                intent2.putExtra("EXTRA_SHOULD_SHOW_LIVE_REQUEST", z10);
            }
            startActivity(intent2);
        }
        stopService(ArchivePlayerService.L.a(this));
        super.finish();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final void k4(TextView textView, int i10) {
        String sb2;
        int i11 = i10 / 3600000;
        int i12 = i10 - (3600000 * i11);
        int i13 = i12 / 60000;
        int i14 = (i12 - (60000 * i13)) / 1000;
        if (i11 == 0) {
            StringBuilder sb3 = new StringBuilder();
            i0 i0Var = i0.f38149a;
            String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
            jo.p.g(format, "format(format, *args)");
            sb3.append(format);
            sb3.append(':');
            String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
            jo.p.g(format2, "format(format, *args)");
            sb3.append(format2);
            sb2 = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i11);
            sb4.append(':');
            i0 i0Var2 = i0.f38149a;
            String format3 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
            jo.p.g(format3, "format(format, *args)");
            sb4.append(format3);
            sb4.append(':');
            String format4 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14)}, 1));
            jo.p.g(format4, "format(format, *args)");
            sb4.append(format4);
            sb2 = sb4.toString();
        }
        textView.setText(sb2);
    }

    public final void l4() {
        final i iVar = new i();
        registerReceiver(iVar, new IntentFilter("com.dena.mirrorman.action.STOP_PLAYING"));
        g().a(new androidx.lifecycle.r() { // from class: com.dena.mirrativ.player.archive.ArchivePlayerActivity$setupStopPlayBroadcastReceiver$1
            @Override // androidx.lifecycle.r
            public void i(u uVar, o.b bVar) {
                p.h(uVar, "source");
                p.h(bVar, "event");
                if (bVar == o.b.ON_DESTROY) {
                    ArchivePlayerActivity.this.unregisterReceiver(iVar);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [uo.d2, T] */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void m4() {
        ?? d10;
        final e0 e0Var = new e0();
        kb.a aVar = null;
        d10 = uo.l.d(this, null, null, new n(null), 3, null);
        e0Var.f38136w = d10;
        kb.a aVar2 = this.P;
        if (aVar2 == null) {
            jo.p.v("binding");
            aVar2 = null;
        }
        aVar2.Q.setOnClickListener(new View.OnClickListener() { // from class: jb.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArchivePlayerActivity.o4(ArchivePlayerActivity.this, view);
            }
        });
        kb.a aVar3 = this.P;
        if (aVar3 == null) {
            jo.p.v("binding");
            aVar3 = null;
        }
        aVar3.E.setOnClickListener(new View.OnClickListener() { // from class: jb.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArchivePlayerActivity.p4(ArchivePlayerActivity.this, view);
            }
        });
        kb.a aVar4 = this.P;
        if (aVar4 == null) {
            jo.p.v("binding");
            aVar4 = null;
        }
        ConstraintLayout constraintLayout = aVar4.B;
        jo.p.g(constraintLayout, "binding.archivePlayerRoot");
        g1.a(constraintLayout, new j(e0Var));
        kb.a aVar5 = this.P;
        if (aVar5 == null) {
            jo.p.v("binding");
            aVar5 = null;
        }
        ConstraintLayout constraintLayout2 = aVar5.O;
        jo.p.g(constraintLayout2, "binding.playbackSpeedControllerContainer");
        g1.a(constraintLayout2, new k(e0Var));
        kb.a aVar6 = this.P;
        if (aVar6 == null) {
            jo.p.v("binding");
            aVar6 = null;
        }
        aVar6.F.setOnClickListener(new View.OnClickListener() { // from class: jb.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArchivePlayerActivity.q4(e0.this, this, view);
            }
        });
        kb.a aVar7 = this.P;
        if (aVar7 == null) {
            jo.p.v("binding");
            aVar7 = null;
        }
        aVar7.R.setOnSeekBarChangeListener(new l(e0Var));
        kb.a aVar8 = this.P;
        if (aVar8 == null) {
            jo.p.v("binding");
            aVar8 = null;
        }
        aVar8.N.setOnClickListener(new View.OnClickListener() { // from class: jb.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArchivePlayerActivity.r4(ArchivePlayerActivity.this, e0Var, view);
            }
        });
        kb.a aVar9 = this.P;
        if (aVar9 == null) {
            jo.p.v("binding");
            aVar9 = null;
        }
        aVar9.C.setOnClickListener(new View.OnClickListener() { // from class: jb.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArchivePlayerActivity.s4(ArchivePlayerActivity.this, e0Var, view);
            }
        });
        kb.a aVar10 = this.P;
        if (aVar10 == null) {
            jo.p.v("binding");
            aVar10 = null;
        }
        aVar10.I.setOnClickListener(new View.OnClickListener() { // from class: jb.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArchivePlayerActivity.t4(ArchivePlayerActivity.this, e0Var, view);
            }
        });
        kb.a aVar11 = this.P;
        if (aVar11 == null) {
            jo.p.v("binding");
            aVar11 = null;
        }
        aVar11.L.setOnClickListener(new View.OnClickListener() { // from class: jb.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArchivePlayerActivity.u4(ArchivePlayerActivity.this, e0Var, view);
            }
        });
        kb.a aVar12 = this.P;
        if (aVar12 == null) {
            jo.p.v("binding");
        } else {
            aVar = aVar12;
        }
        aVar.T.setSurfaceTextureListener(this);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        ViewDataBinding g10 = androidx.databinding.f.g(this, x1.activity_archive_player);
        jo.p.g(g10, "setContentView(this, R.l….activity_archive_player)");
        this.P = (kb.a) g10;
        m4();
        te.c f10 = a4().i().f();
        kb.a aVar = null;
        if (f10 != null) {
            X3();
            kb.a aVar2 = this.P;
            if (aVar2 == null) {
                jo.p.v("binding");
                aVar2 = null;
            }
            AppCompatImageView appCompatImageView = aVar2.L;
            jo.p.g(appCompatImageView, "binding.ownerIconImageView");
            de.f.e(appCompatImageView, f10.f(), Integer.valueOf(v1.S));
            kb.a aVar3 = this.P;
            if (aVar3 == null) {
                jo.p.v("binding");
                aVar3 = null;
            }
            aVar3.M.setText(f10.e());
        }
        Boolean f11 = a4().l().f();
        if (f11 != null) {
            kb.a aVar4 = this.P;
            if (aVar4 == null) {
                jo.p.v("binding");
                aVar4 = null;
            }
            aVar4.K.setVisibility(f11.booleanValue() ? 8 : 0);
        }
        te.a f12 = a4().k().f();
        if (f12 != null) {
            x4(f12);
        }
        Float f13 = a4().j().f();
        if (f13 != null) {
            kb.a aVar5 = this.P;
            if (aVar5 == null) {
                jo.p.v("binding");
            } else {
                aVar = aVar5;
            }
            aVar.G.setText(Y3(f13.floatValue()));
        }
        PopupMenu popupMenu = this.Z;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, x1.activity_archive_player);
        jo.p.g(g10, "setContentView(this, R.l….activity_archive_player)");
        this.P = (kb.a) g10;
        dq.c.c().p(this);
        this.X = System.currentTimeMillis();
        bindService(ArchivePlayerService.L.a(this), this.V, 0);
        m4();
        f4();
        l4();
        jb.a Z3 = Z3();
        String c42 = c4();
        jo.p.g(c42, "liveId");
        Z3.d(c42);
        getWindow().setSoftInputMode(3);
        Puree.d(new Live.PlayerStart(a4().i().f(), Referer.ARCHIVE_VIEW, e4()));
        uo.l.d(this, null, null, new g(null), 3, null);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        dq.c.c().r(this);
        r0.d(this, null, 1, null);
        if (this.W != null) {
            unbindService(this.V);
        }
        Puree.d(new Live.PlayerEnd(a4().i().f(), Referer.ARCHIVE_VIEW, e4()));
        super.onDestroy();
    }

    @dq.l
    public final void onEvent(y.g gVar) {
        jo.p.h(gVar, "event");
        Display display = ((DisplayManager) getSystemService(DisplayManager.class)).getDisplay(0);
        kb.a aVar = null;
        if (display.getRotation() == 1) {
            kb.a aVar2 = this.P;
            if (aVar2 == null) {
                jo.p.v("binding");
                aVar2 = null;
            }
            aVar2.T.setVideoOrientation("6");
        } else if (display.getRotation() == 3) {
            kb.a aVar3 = this.P;
            if (aVar3 == null) {
                jo.p.v("binding");
                aVar3 = null;
            }
            aVar3.T.setVideoOrientation("8");
        }
        kb.a aVar4 = this.P;
        if (aVar4 == null) {
            jo.p.v("binding");
        } else {
            aVar = aVar4;
        }
        aVar.T.setVideoSize(new Size(gVar.b(), gVar.a()));
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        ArchivePlayerService archivePlayerService;
        super.onPause();
        if (!isFinishing() && (archivePlayerService = this.W) != null) {
            archivePlayerService.q();
        }
        ArchivePlayerService archivePlayerService2 = this.W;
        if (archivePlayerService2 != null) {
            archivePlayerService2.p();
        }
        getWindow().clearFlags(128);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        ArchivePlayerService archivePlayerService;
        super.onResume();
        ArchivePlayerService archivePlayerService2 = this.W;
        if (archivePlayerService2 != null) {
            archivePlayerService2.r();
        }
        Surface surface = this.Y;
        if (surface != null && (archivePlayerService = this.W) != null) {
            archivePlayerService.L(surface);
        }
        getWindow().addFlags(128);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        jo.p.h(surfaceTexture, "surfaceTexture");
        Surface surface = new Surface(surfaceTexture);
        this.Y = surface;
        ArchivePlayerService archivePlayerService = this.W;
        if (archivePlayerService != null) {
            archivePlayerService.L(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jo.p.h(surfaceTexture, "surfaceTexture");
        this.Y = null;
        ArchivePlayerService archivePlayerService = this.W;
        if (archivePlayerService != null) {
            archivePlayerService.p();
            return false;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        jo.p.h(surfaceTexture, "surfaceTexture");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        jo.p.h(surfaceTexture, "surfaceTexture");
    }

    public final void w4() {
        te.c f10 = a4().i().f();
        if (f10 == null) {
            return;
        }
        ArchivePlayerService.a aVar = ArchivePlayerService.L;
        List<LiveTimeline> timeline = f10.getTimeline();
        c3.a.n(this, aVar.b(this, f10, timeline instanceof ArrayList ? (ArrayList) timeline : null));
    }

    public final void x4(te.a aVar) {
        kb.a aVar2 = null;
        if (aVar.e()) {
            kb.a aVar3 = this.P;
            if (aVar3 == null) {
                jo.p.v("binding");
                aVar3 = null;
            }
            aVar3.N.setVisibility(0);
            kb.a aVar4 = this.P;
            if (aVar4 == null) {
                jo.p.v("binding");
                aVar4 = null;
            }
            aVar4.P.setVisibility(0);
            kb.a aVar5 = this.P;
            if (aVar5 == null) {
                jo.p.v("binding");
            } else {
                aVar2 = aVar5;
            }
            aVar2.Q.setVisibility(8);
        } else if (aVar.i()) {
            kb.a aVar6 = this.P;
            if (aVar6 == null) {
                jo.p.v("binding");
                aVar6 = null;
            }
            aVar6.N.setVisibility(0);
            kb.a aVar7 = this.P;
            if (aVar7 == null) {
                jo.p.v("binding");
                aVar7 = null;
            }
            aVar7.N.setImageResource(z1.btn_pose);
            kb.a aVar8 = this.P;
            if (aVar8 == null) {
                jo.p.v("binding");
                aVar8 = null;
            }
            aVar8.P.setVisibility(8);
            kb.a aVar9 = this.P;
            if (aVar9 == null) {
                jo.p.v("binding");
            } else {
                aVar2 = aVar9;
            }
            aVar2.Q.setVisibility(8);
        } else if (aVar.h()) {
            kb.a aVar10 = this.P;
            if (aVar10 == null) {
                jo.p.v("binding");
                aVar10 = null;
            }
            aVar10.N.setVisibility(0);
            kb.a aVar11 = this.P;
            if (aVar11 == null) {
                jo.p.v("binding");
                aVar11 = null;
            }
            aVar11.N.setImageResource(z1.btn_play);
            kb.a aVar12 = this.P;
            if (aVar12 == null) {
                jo.p.v("binding");
                aVar12 = null;
            }
            aVar12.P.setVisibility(8);
            kb.a aVar13 = this.P;
            if (aVar13 == null) {
                jo.p.v("binding");
            } else {
                aVar2 = aVar13;
            }
            aVar2.Q.setVisibility(8);
        } else if (aVar.b()) {
            kb.a aVar14 = this.P;
            if (aVar14 == null) {
                jo.p.v("binding");
                aVar14 = null;
            }
            aVar14.N.setVisibility(8);
            kb.a aVar15 = this.P;
            if (aVar15 == null) {
                jo.p.v("binding");
                aVar15 = null;
            }
            aVar15.P.setVisibility(8);
            kb.a aVar16 = this.P;
            if (aVar16 == null) {
                jo.p.v("binding");
            } else {
                aVar2 = aVar16;
            }
            aVar2.Q.setVisibility(0);
            t1.a aVar17 = t1.f61795x;
            String string = getString(b2.f34716d);
            jo.p.g(string, "getString(R.string.error_unable)");
            aVar17.a(this, string);
        } else if (aVar.c()) {
            kb.a aVar18 = this.P;
            if (aVar18 == null) {
                jo.p.v("binding");
                aVar18 = null;
            }
            aVar18.N.setVisibility(8);
            kb.a aVar19 = this.P;
            if (aVar19 == null) {
                jo.p.v("binding");
                aVar19 = null;
            }
            aVar19.P.setVisibility(8);
            kb.a aVar20 = this.P;
            if (aVar20 == null) {
                jo.p.v("binding");
            } else {
                aVar2 = aVar20;
            }
            aVar2.Q.setVisibility(0);
        } else if (aVar.f()) {
            if (isFinishing()) {
                return;
            }
            finish();
        } else {
            g9.a.f32826a.b("untracked status", new Object[0]);
        }
    }
}
