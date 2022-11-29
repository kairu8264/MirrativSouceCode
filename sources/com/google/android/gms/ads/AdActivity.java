package com.google.android.gms.ads;

import ai.dt;
import ai.qc0;
import ai.uj0;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import yh.b;

/* loaded from: classes3.dex */
public final class AdActivity extends Activity {

    /* renamed from: w  reason: collision with root package name */
    public qc0 f27138w;

    public final void a() {
        qc0 qc0Var = this.f27138w;
        if (qc0Var != null) {
            try {
                qc0Var.q();
            } catch (RemoteException e10) {
                uj0.i("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, @RecentlyNonNull Intent intent) {
        try {
            qc0 qc0Var = this.f27138w;
            if (qc0Var != null) {
                qc0Var.p1(i10, i11, intent);
            }
        } catch (Exception e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            qc0 qc0Var = this.f27138w;
            if (qc0Var != null) {
                if (!qc0Var.f()) {
                    return;
                }
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            qc0 qc0Var2 = this.f27138w;
            if (qc0Var2 != null) {
                qc0Var2.c();
            }
        } catch (RemoteException e11) {
            uj0.i("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            qc0 qc0Var = this.f27138w;
            if (qc0Var != null) {
                qc0Var.h0(b.h1(configuration));
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qc0 j10 = dt.b().j(this);
        this.f27138w = j10;
        if (j10 != null) {
            try {
                j10.a0(bundle);
                return;
            } catch (RemoteException e10) {
                uj0.i("#007 Could not call remote method.", e10);
                finish();
                return;
            }
        }
        uj0.i("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            qc0 qc0Var = this.f27138w;
            if (qc0Var != null) {
                qc0Var.l();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            qc0 qc0Var = this.f27138w;
            if (qc0Var != null) {
                qc0Var.j();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            qc0 qc0Var = this.f27138w;
            if (qc0Var != null) {
                qc0Var.h();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            qc0 qc0Var = this.f27138w;
            if (qc0Var != null) {
                qc0Var.i();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        try {
            qc0 qc0Var = this.f27138w;
            if (qc0Var != null) {
                qc0Var.l0(bundle);
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            qc0 qc0Var = this.f27138w;
            if (qc0Var != null) {
                qc0Var.g();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            qc0 qc0Var = this.f27138w;
            if (qc0Var != null) {
                qc0Var.p();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            qc0 qc0Var = this.f27138w;
            if (qc0Var != null) {
                qc0Var.a();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(@RecentlyNonNull View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(@RecentlyNonNull View view, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
