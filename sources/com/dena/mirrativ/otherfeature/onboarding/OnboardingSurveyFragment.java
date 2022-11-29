package com.dena.mirrativ.otherfeature.onboarding;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import eb.l;
import eb.m;
import eb.n;
import io.p;
import jo.f0;
import jo.q;
import s0.c;
import wn.f;
import wn.g;
import wn.i;
import wn.v;

/* loaded from: classes2.dex */
public final class OnboardingSurveyFragment extends Fragment {

    /* renamed from: x0  reason: collision with root package name */
    public l f21806x0;

    /* renamed from: y0  reason: collision with root package name */
    public final f f21807y0 = g.b(i.SYNCHRONIZED, new b(this, null, null));

    /* loaded from: classes2.dex */
    public static final class a extends q implements p<l0.i, Integer, v> {

        /* renamed from: com.dena.mirrativ.otherfeature.onboarding.OnboardingSurveyFragment$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0190a extends q implements io.l<m, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ OnboardingSurveyFragment f21809w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0190a(OnboardingSurveyFragment onboardingSurveyFragment) {
                super(1);
                this.f21809w = onboardingSurveyFragment;
            }

            public final void a(m mVar) {
                jo.p.h(mVar, "it");
                l lVar = this.f21809w.f21806x0;
                if (lVar != null) {
                    lVar.d2(mVar);
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(m mVar) {
                a(mVar);
                return v.f59242a;
            }
        }

        public a() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                n.a(new C0190a(OnboardingSurveyFragment.this), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21810w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21811x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21812y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21810w = componentCallbacks;
            this.f21811x = aVar;
            this.f21812y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f21810w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f21811x, this.f21812y);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        MRLogger k32 = k3();
        MRLog.Companion companion = MRLog.Companion;
        k32.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_TUTORIAL_SURVEY_IMP).build());
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setContent(c.c(-424834260, true, new a()));
        return composeView;
    }

    public final MRLogger k3() {
        return (MRLogger) this.f21807y0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.f21806x0 = context instanceof l ? (l) context : null;
    }
}
