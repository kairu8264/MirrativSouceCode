package com.dena.mirrorman.fragment;

import ae.i6;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import com.dena.mirrorman.unity.MRUnityPlayer;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import nd.b1;
import wn.f;
import wn.g;
import wn.i;

/* loaded from: classes2.dex */
public final class EmomoGameViewFragment extends Fragment {

    /* renamed from: y0  reason: collision with root package name */
    public static final a f26056y0 = new a(null);

    /* renamed from: z0  reason: collision with root package name */
    public static final int f26057z0 = 8;

    /* renamed from: x0  reason: collision with root package name */
    public final f f26058x0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final EmomoGameViewFragment a() {
            return new EmomoGameViewFragment();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<MRUnityPlayer> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26059w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26060x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26061y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26059w = componentCallbacks;
            this.f26060x = aVar;
            this.f26061y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.unity.MRUnityPlayer, java.lang.Object] */
        @Override // io.a
        public final MRUnityPlayer invoke() {
            ComponentCallbacks componentCallbacks = this.f26059w;
            return gq.a.a(componentCallbacks).c(f0.b(MRUnityPlayer.class), this.f26060x, this.f26061y);
        }
    }

    public EmomoGameViewFragment() {
        super(b1.fragment_emomo_game_view);
        this.f26058x0 = g.b(i.SYNCHRONIZED, new b(this, null, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        p.h(view, "view");
        super.e2(view, bundle);
        final i6 T = i6.T(view);
        a1().g().a(new r() { // from class: com.dena.mirrorman.fragment.EmomoGameViewFragment$onViewCreated$1

            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f26064a;

                static {
                    int[] iArr = new int[o.b.values().length];
                    iArr[o.b.ON_START.ordinal()] = 1;
                    iArr[o.b.ON_RESUME.ordinal()] = 2;
                    iArr[o.b.ON_PAUSE.ordinal()] = 3;
                    iArr[o.b.ON_STOP.ordinal()] = 4;
                    f26064a = iArr;
                }
            }

            @Override // androidx.lifecycle.r
            public void i(u uVar, o.b bVar) {
                MRUnityPlayer k32;
                MRUnityPlayer k33;
                p.h(uVar, "source");
                p.h(bVar, "event");
                int i10 = a.f26064a[bVar.ordinal()];
                if (i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    k33 = EmomoGameViewFragment.this.k3();
                    k33.stop();
                    return;
                }
                k32 = EmomoGameViewFragment.this.k3();
                FrameLayout frameLayout = T.B;
                p.g(frameLayout, "binding.avatarContainer");
                k32.start(frameLayout);
            }
        });
    }

    public final MRUnityPlayer k3() {
        return (MRUnityPlayer) this.f26058x0.getValue();
    }
}
