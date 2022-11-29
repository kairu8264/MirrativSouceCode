package ai;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzehs;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class c02 implements yy1<ty0, ya0, n02> {

    /* renamed from: a */
    public final Context f2647a;

    /* renamed from: b */
    public final rz0 f2648b;

    /* renamed from: c */
    public View f2649c;

    /* renamed from: d */
    public i90 f2650d;

    public c02(Context context, rz0 rz0Var) {
        this.f2647a = context;
        this.f2648b = rz0Var;
    }

    @Override // ai.yy1
    public final void a(sl2 sl2Var, fl2 fl2Var, uy1<ya0, n02> uy1Var) throws zzfaw {
        try {
            uy1Var.f10879b.r0(fl2Var.V);
            if (((Boolean) ft.c().c(ox.B5)).booleanValue() && fl2Var.f4087d0) {
                uy1Var.f10879b.d3(fl2Var.Q, fl2Var.f4111v.toString(), sl2Var.f9875a.f8473a.f12650d, yh.b.h1(this.f2647a), new a02(this, uy1Var, null), uy1Var.f10880c, sl2Var.f9875a.f8473a.f12651e);
            } else {
                uy1Var.f10879b.W4(fl2Var.Q, fl2Var.f4111v.toString(), sl2Var.f9875a.f8473a.f12650d, yh.b.h1(this.f2647a), new a02(this, uy1Var, null), uy1Var.f10880c, sl2Var.f9875a.f8473a.f12651e);
            }
        } catch (RemoteException e10) {
            throw new zzfaw(e10);
        }
    }

    @Override // ai.yy1
    public final /* bridge */ /* synthetic */ ty0 b(sl2 sl2Var, fl2 fl2Var, uy1<ya0, n02> uy1Var) throws zzfaw, zzehs {
        View view;
        if (((Boolean) ft.c().c(ox.B5)).booleanValue() && fl2Var.f4087d0) {
            try {
                view = (View) yh.b.z0(this.f2650d.c());
                boolean a10 = this.f2650d.a();
                if (view == null) {
                    throw new zzfaw(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (a10) {
                    try {
                        view = (View) j43.i(j43.a(null), new p33(this, view, fl2Var) { // from class: ai.zz1

                            /* renamed from: a  reason: collision with root package name */
                            public final c02 f13286a;

                            /* renamed from: b  reason: collision with root package name */
                            public final View f13287b;

                            /* renamed from: c  reason: collision with root package name */
                            public final fl2 f13288c;

                            {
                                this.f13286a = this;
                                this.f13287b = view;
                                this.f13288c = fl2Var;
                            }

                            @Override // ai.p33
                            public final s43 a(Object obj) {
                                return this.f13286a.e(this.f13287b, this.f13288c, obj);
                            }
                        }, hk0.f4882e).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfaw(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfaw(e11);
            }
        } else {
            view = this.f2649c;
        }
        uy0 d10 = this.f2648b.d(new j11(sl2Var, fl2Var, uy1Var.f10878a), new az0(view, null, new s01(uy1Var) { // from class: ai.yz1

            /* renamed from: a  reason: collision with root package name */
            public final uy1 f12776a;

            {
                this.f12776a = uy1Var;
            }

            @Override // ai.s01
            public final pv zza() {
                try {
                    return ((ya0) this.f12776a.f10879b).e();
                } catch (RemoteException e12) {
                    throw new zzfaw(e12);
                }
            }
        }, fl2Var.f4110u.get(0)));
        d10.j().S0(view);
        uy1Var.f10880c.S5(d10.g());
        return d10.h();
    }

    public final /* synthetic */ s43 e(View view, fl2 fl2Var, Object obj) throws Exception {
        return j43.a(i01.a(this.f2647a, view, fl2Var));
    }
}
