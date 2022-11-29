package wg;

import ai.nt;
import ai.tm2;
import ai.uj0;
import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes3.dex */
public final class m extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f58717a;

    public m(s sVar) {
        this.f58717a = sVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        nt ntVar;
        nt ntVar2;
        nt ntVar3;
        nt ntVar4;
        ntVar = this.f58717a.C;
        if (ntVar != null) {
            try {
                ntVar2 = this.f58717a.C;
                ntVar2.Z(tm2.d(1, null, null));
            } catch (RemoteException e10) {
                uj0.i("#007 Could not call remote method.", e10);
            }
        }
        ntVar3 = this.f58717a.C;
        if (ntVar3 != null) {
            try {
                ntVar4 = this.f58717a.C;
                ntVar4.F(0);
            } catch (RemoteException e11) {
                uj0.i("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        nt ntVar;
        nt ntVar2;
        nt ntVar3;
        nt ntVar4;
        nt ntVar5;
        nt ntVar6;
        nt ntVar7;
        nt ntVar8;
        nt ntVar9;
        nt ntVar10;
        nt ntVar11;
        nt ntVar12;
        nt ntVar13;
        if (str.startsWith(this.f58717a.U5())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            ntVar10 = this.f58717a.C;
            if (ntVar10 != null) {
                try {
                    ntVar11 = this.f58717a.C;
                    ntVar11.Z(tm2.d(3, null, null));
                } catch (RemoteException e10) {
                    uj0.i("#007 Could not call remote method.", e10);
                }
            }
            ntVar12 = this.f58717a.C;
            if (ntVar12 != null) {
                try {
                    ntVar13 = this.f58717a.C;
                    ntVar13.F(3);
                } catch (RemoteException e11) {
                    uj0.i("#007 Could not call remote method.", e11);
                }
            }
            this.f58717a.S5(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            ntVar6 = this.f58717a.C;
            if (ntVar6 != null) {
                try {
                    ntVar7 = this.f58717a.C;
                    ntVar7.Z(tm2.d(1, null, null));
                } catch (RemoteException e12) {
                    uj0.i("#007 Could not call remote method.", e12);
                }
            }
            ntVar8 = this.f58717a.C;
            if (ntVar8 != null) {
                try {
                    ntVar9 = this.f58717a.C;
                    ntVar9.F(0);
                } catch (RemoteException e13) {
                    uj0.i("#007 Could not call remote method.", e13);
                }
            }
            this.f58717a.S5(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            ntVar4 = this.f58717a.C;
            if (ntVar4 != null) {
                try {
                    ntVar5 = this.f58717a.C;
                    ntVar5.a();
                } catch (RemoteException e14) {
                    uj0.i("#007 Could not call remote method.", e14);
                }
            }
            this.f58717a.S5(this.f58717a.R5(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            ntVar = this.f58717a.C;
            if (ntVar != null) {
                try {
                    ntVar2 = this.f58717a.C;
                    ntVar2.e();
                    ntVar3 = this.f58717a.C;
                    ntVar3.c();
                } catch (RemoteException e15) {
                    uj0.i("#007 Could not call remote method.", e15);
                }
            }
            s.W5(this.f58717a, s.V5(this.f58717a, str));
            return true;
        }
    }
}
