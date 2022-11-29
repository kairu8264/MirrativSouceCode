package com.dena.mirrativ.streaming.liveprepare.mainsettings;

import androidx.lifecycle.g0;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import be.n3;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.response.live.RequestPackageUsageStats;
import hf.u0;
import io.a;
import jo.q;
import wn.v;

/* loaded from: classes2.dex */
public final class LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14$1$emit$2 extends q implements a<v> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ RequestPackageUsageStats f23897w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23898x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14$1$emit$2(RequestPackageUsageStats requestPackageUsageStats, LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment) {
        super(0);
        this.f23897w = requestPackageUsageStats;
        this.f23898x = liveMainSettingsBottomSheetDialogFragment;
    }

    public final void a() {
        MRLogger j42;
        n3.Q0.a(this.f23897w.getTitle(), this.f23897w.getImageUrl()).z3(this.f23898x.p0(), "RequestUsageStatsPermissionDialogFragment");
        j42 = this.f23898x.j4();
        MRLog.Companion companion = MRLog.Companion;
        j42.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_ANNOUNCEMENT_FOREGROUND_PERMISSION_IMP).build());
        o g10 = this.f23898x.a1().g();
        final LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment = this.f23898x;
        g10.a(new t() { // from class: com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14$1$emit$2.1
            @g0(o.b.ON_RESUME)
            public final void onResume() {
                u0 n42;
                n42 = LiveMainSettingsBottomSheetDialogFragment.this.n4();
                if (n42.a()) {
                    LiveMainSettingsBottomSheetDialogFragment.this.g4();
                    LiveMainSettingsBottomSheetDialogFragment.this.G4();
                    LiveMainSettingsBottomSheetDialogFragment.this.a1().g().c(this);
                }
            }
        });
    }

    @Override // io.a
    public /* bridge */ /* synthetic */ v invoke() {
        a();
        return v.f59242a;
    }
}
