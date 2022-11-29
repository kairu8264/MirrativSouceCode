package com.dena.mirrativ.streaming.liveprepare.mainsettings;

import androidx.fragment.app.Fragment;
import ao.d;
import bo.c;
import co.f;
import co.l;
import com.dena.mirrorman.net.api.response.live.RequestPackageUsageStats;
import hf.u0;
import io.p;
import jc.j;
import kotlin.KotlinNothingValueException;
import sd.b;
import uo.q0;
import wn.m;
import wn.v;
import xo.w;

@f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14", f = "LiveMainSettingsBottomSheetDialogFragment.kt", l = {547}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14 extends l implements p<q0, d<? super v>, Object> {

    /* renamed from: w  reason: collision with root package name */
    public int f23894w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ LiveMainSettingsBottomSheetDialogFragment f23895x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14(LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment, d<? super LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14> dVar) {
        super(2, dVar);
        this.f23895x = liveMainSettingsBottomSheetDialogFragment;
    }

    @Override // co.a
    public final d<v> create(Object obj, d<?> dVar) {
        return new LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14(this.f23895x, dVar);
    }

    @Override // io.p
    public final Object invoke(q0 q0Var, d<? super v> dVar) {
        return ((LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14) create(q0Var, dVar)).invokeSuspend(v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object c10 = c.c();
        int i10 = this.f23894w;
        if (i10 == 0) {
            m.b(obj);
            j jVar = this.f23895x.R0;
            if (jVar == null) {
                jo.p.v("store");
                jVar = null;
            }
            w<RequestPackageUsageStats> R = jVar.R();
            final LiveMainSettingsBottomSheetDialogFragment liveMainSettingsBottomSheetDialogFragment = this.f23895x;
            xo.d<RequestPackageUsageStats> dVar = new xo.d<RequestPackageUsageStats>() { // from class: com.dena.mirrativ.streaming.liveprepare.mainsettings.LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14.1
                @Override // xo.d
                /* renamed from: a */
                public final Object emit(RequestPackageUsageStats requestPackageUsageStats, d<? super v> dVar2) {
                    u0 n42;
                    Fragment e02 = LiveMainSettingsBottomSheetDialogFragment.this.p0().e0("ProgressDialogFragment");
                    b bVar = e02 instanceof b ? (b) e02 : null;
                    if (bVar != null) {
                        bVar.n3();
                    }
                    n42 = LiveMainSettingsBottomSheetDialogFragment.this.n4();
                    if (n42.a()) {
                        LiveMainSettingsBottomSheetDialogFragment.this.G4();
                    } else {
                        LiveMainSettingsBottomSheetDialogFragment.this.V0.c(new LiveMainSettingsBottomSheetDialogFragment$observeStoreValues$14$1$emit$2(requestPackageUsageStats, LiveMainSettingsBottomSheetDialogFragment.this));
                    }
                    return v.f59242a;
                }
            };
            this.f23894w = 1;
            if (R.a(dVar, this) == c10) {
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
