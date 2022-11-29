package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.g;

/* loaded from: classes3.dex */
public class b extends g {
    public boolean N0;

    /* renamed from: com.google.android.material.bottomsheet.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0241b extends BottomSheetBehavior.g {
        public C0241b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, int i10) {
            if (i10 == 5) {
                b.this.C3();
            }
        }
    }

    public final void C3() {
        if (this.N0) {
            super.n3();
        } else {
            super.m3();
        }
    }

    public final void D3(BottomSheetBehavior<?> bottomSheetBehavior, boolean z10) {
        this.N0 = z10;
        if (bottomSheetBehavior.f0() == 5) {
            C3();
            return;
        }
        if (p3() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) p3()).l();
        }
        bottomSheetBehavior.S(new C0241b());
        bottomSheetBehavior.z0(5);
    }

    public final boolean E3(boolean z10) {
        Dialog p32 = p3();
        if (p32 instanceof com.google.android.material.bottomsheet.a) {
            com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) p32;
            BottomSheetBehavior<FrameLayout> j10 = aVar.j();
            if (j10.i0() && aVar.k()) {
                D3(j10, z10);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.e
    public void m3() {
        if (E3(false)) {
            return;
        }
        super.m3();
    }

    @Override // androidx.fragment.app.e
    public void n3() {
        if (E3(true)) {
            return;
        }
        super.n3();
    }

    @Override // e.g, androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(q0(), q3());
    }
}
