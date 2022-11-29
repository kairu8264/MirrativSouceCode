package com.dena.mirrativ.otherfeature.onboarding;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.dena.mirrativ.otherfeature.onboarding.MakeEmomoOnboardingFragment;
import com.dena.mirrorman.AutoClearedValue;
import db.m;
import eb.d;
import jo.f0;
import jo.p;
import jo.s;
import nd.a;
import qo.h;
import wa.i;

/* loaded from: classes2.dex */
public final class MakeEmomoOnboardingFragment extends Fragment implements TextureView.SurfaceTextureListener {
    public static final /* synthetic */ h<Object>[] A0 = {f0.d(new s(MakeEmomoOnboardingFragment.class, "binding", "getBinding()Lcom/dena/mirrativ/otherfeature/databinding/FragmentMakeEmomoOnboardingBinding;", 0))};
    public static final int B0 = 8;

    /* renamed from: x0  reason: collision with root package name */
    public final AutoClearedValue f21734x0 = a.a(this);

    /* renamed from: y0  reason: collision with root package name */
    public d f21735y0;

    /* renamed from: z0  reason: collision with root package name */
    public MediaPlayer f21736z0;

    public static final void m3(MakeEmomoOnboardingFragment makeEmomoOnboardingFragment, View view) {
        p.h(makeEmomoOnboardingFragment, "this$0");
        d dVar = makeEmomoOnboardingFragment.f21735y0;
        if (dVar != null) {
            dVar.u2();
        }
    }

    public static final void n3(MakeEmomoOnboardingFragment makeEmomoOnboardingFragment, View view) {
        p.h(makeEmomoOnboardingFragment, "this$0");
        d dVar = makeEmomoOnboardingFragment.f21735y0;
        if (dVar != null) {
            dVar.b0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        m T = m.T(layoutInflater, viewGroup, false);
        p.g(T, "inflate(\n            inf…          false\n        )");
        o3(T);
        View u10 = l3().u();
        p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        p.h(view, "view");
        super.e2(view, bundle);
        l3().C.setSurfaceTextureListener(this);
        l3().D.setOnClickListener(new View.OnClickListener() { // from class: eb.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MakeEmomoOnboardingFragment.m3(MakeEmomoOnboardingFragment.this, view2);
            }
        });
        l3().F.setOnClickListener(new View.OnClickListener() { // from class: eb.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MakeEmomoOnboardingFragment.n3(MakeEmomoOnboardingFragment.this, view2);
            }
        });
    }

    public final m l3() {
        return (m) this.f21734x0.b(this, A0[0]);
    }

    public final void o3(m mVar) {
        this.f21734x0.a(this, A0[0], mVar);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        p.h(surfaceTexture, "surface");
        MediaPlayer create = MediaPlayer.create(N2(), i.tutorial_emomo_movie);
        this.f21736z0 = create;
        if (create != null) {
            float videoWidth = (create.getVideoWidth() / create.getVideoHeight()) / (l3().C.getWidth() / l3().C.getHeight());
            if (videoWidth >= 1.0f) {
                l3().C.setScaleX(videoWidth);
            } else {
                l3().C.setScaleY(1.0f / videoWidth);
            }
            create.setSurface(new Surface(surfaceTexture));
            create.setLooping(true);
            create.start();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        p.h(surfaceTexture, "surface");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        p.h(surfaceTexture, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        p.h(surfaceTexture, "surface");
    }

    @Override // androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.f21735y0 = context instanceof d ? (d) context : null;
    }
}
