package com.unity3d.player;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes4.dex */
public final class e extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private final IPermissionRequestCallbacks f28497a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f28498b;

    /* renamed from: c  reason: collision with root package name */
    private final Looper f28499c;

    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private IPermissionRequestCallbacks f28501b;

        /* renamed from: c  reason: collision with root package name */
        private String f28502c;

        /* renamed from: d  reason: collision with root package name */
        private int f28503d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f28504e;

        public a(IPermissionRequestCallbacks iPermissionRequestCallbacks, String str, int i10, boolean z10) {
            this.f28501b = iPermissionRequestCallbacks;
            this.f28502c = str;
            this.f28503d = i10;
            this.f28504e = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f28503d;
            if (i10 != -1) {
                if (i10 == 0) {
                    this.f28501b.onPermissionGranted(this.f28502c);
                }
            } else if (this.f28504e) {
                this.f28501b.onPermissionDenied(this.f28502c);
            } else {
                this.f28501b.onPermissionDeniedAndDontAskAgain(this.f28502c);
            }
        }
    }

    public e() {
        this.f28497a = null;
        this.f28498b = null;
        this.f28499c = null;
    }

    public e(Activity activity, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        this.f28497a = iPermissionRequestCallbacks;
        this.f28498b = activity;
        this.f28499c = Looper.myLooper();
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray("PermissionNames"), 96489);
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 96489) {
            return;
        }
        if (strArr.length == 0) {
            requestPermissions(getArguments().getStringArray("PermissionNames"), 96489);
            return;
        }
        for (int i11 = 0; i11 < strArr.length && i11 < iArr.length; i11++) {
            if (this.f28497a != null && this.f28498b != null && this.f28499c != null) {
                String str = strArr[i11] == null ? "<null>" : strArr[i11];
                new Handler(this.f28499c).post(new a(this.f28497a, str, iArr[i11], this.f28498b.shouldShowRequestPermissionRationale(str)));
            }
        }
        FragmentTransaction beginTransaction = getActivity().getFragmentManager().beginTransaction();
        beginTransaction.remove(this);
        beginTransaction.commit();
    }
}
