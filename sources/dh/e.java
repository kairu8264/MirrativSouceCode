package dh;

import ai.dw;
import ai.ft;
import ai.ox;
import ai.p00;
import ai.uj0;
import ai.xz;
import ai.zz;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import rg.n;

/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    @NotOnlyInitialized

    /* renamed from: w  reason: collision with root package name */
    public final FrameLayout f29648w;
    @NotOnlyInitialized

    /* renamed from: x  reason: collision with root package name */
    public final p00 f29649x;

    @RecentlyNullable
    public final View a(@RecentlyNonNull String str) {
        p00 p00Var = this.f29649x;
        if (p00Var != null) {
            try {
                yh.a A = p00Var.A(str);
                if (A != null) {
                    return (View) yh.b.z0(A);
                }
            } catch (RemoteException e10) {
                uj0.d("Unable to call getAssetView on delegate", e10);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(@RecentlyNonNull View view, int i10, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.f29648w);
    }

    public final /* synthetic */ void b(ImageView.ScaleType scaleType) {
        p00 p00Var = this.f29649x;
        if (p00Var == null || scaleType == null) {
            return;
        }
        try {
            p00Var.y1(yh.b.h1(scaleType));
        } catch (RemoteException e10) {
            uj0.d("Unable to call setMediaViewImageScaleType on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@RecentlyNonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f29648w;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final /* synthetic */ void c(n nVar) {
        p00 p00Var = this.f29649x;
        if (p00Var == null) {
            return;
        }
        try {
            if (nVar instanceof dw) {
                p00Var.b3(((dw) nVar).a());
            } else if (nVar == null) {
                p00Var.b3(null);
            } else {
                uj0.a("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e10) {
            uj0.d("Unable to call setMediaContent on delegate", e10);
        }
    }

    public final void d(String str, View view) {
        p00 p00Var = this.f29649x;
        if (p00Var != null) {
            try {
                p00Var.L2(str, yh.b.h1(view));
            } catch (RemoteException e10) {
                uj0.d("Unable to call setAssetView on delegate", e10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@RecentlyNonNull MotionEvent motionEvent) {
        p00 p00Var;
        if (((Boolean) ft.c().c(ox.Y1)).booleanValue() && (p00Var = this.f29649x) != null) {
            try {
                p00Var.G1(yh.b.h1(motionEvent));
            } catch (RemoteException e10) {
                uj0.d("Unable to call handleTouchEvent on delegate", e10);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @RecentlyNullable
    public a getAdChoicesView() {
        View a10 = a("3011");
        if (a10 instanceof a) {
            return (a) a10;
        }
        return null;
    }

    @RecentlyNullable
    public final View getAdvertiserView() {
        return a("3005");
    }

    @RecentlyNullable
    public final View getBodyView() {
        return a("3004");
    }

    @RecentlyNullable
    public final View getCallToActionView() {
        return a("3002");
    }

    @RecentlyNullable
    public final View getHeadlineView() {
        return a("3001");
    }

    @RecentlyNullable
    public final View getIconView() {
        return a("3003");
    }

    @RecentlyNullable
    public final View getImageView() {
        return a("3008");
    }

    @RecentlyNullable
    public final b getMediaView() {
        View a10 = a("3010");
        if (a10 instanceof b) {
            return (b) a10;
        }
        if (a10 != null) {
            uj0.a("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    @RecentlyNullable
    public final View getPriceView() {
        return a("3007");
    }

    @RecentlyNullable
    public final View getStarRatingView() {
        return a("3009");
    }

    @RecentlyNullable
    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@RecentlyNonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        p00 p00Var = this.f29649x;
        if (p00Var != null) {
            try {
                p00Var.u0(yh.b.h1(view), i10);
            } catch (RemoteException e10) {
                uj0.d("Unable to call onVisibilityChanged on delegate", e10);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f29648w);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@RecentlyNonNull View view) {
        if (this.f29648w == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        d("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        d("3005", view);
    }

    public final void setBodyView(View view) {
        d("3004", view);
    }

    public final void setCallToActionView(View view) {
        d("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        p00 p00Var = this.f29649x;
        if (p00Var != null) {
            try {
                p00Var.P(yh.b.h1(view));
            } catch (RemoteException e10) {
                uj0.d("Unable to call setClickConfirmingView on delegate", e10);
            }
        }
    }

    public final void setHeadlineView(View view) {
        d("3001", view);
    }

    public final void setIconView(View view) {
        d("3003", view);
    }

    public final void setImageView(View view) {
        d("3008", view);
    }

    public final void setMediaView(b bVar) {
        d("3010", bVar);
        if (bVar == null) {
            return;
        }
        bVar.a(new xz(this) { // from class: dh.g

            /* renamed from: a  reason: collision with root package name */
            public final e f29650a;

            {
                this.f29650a = this;
            }

            @Override // ai.xz
            public final void a(n nVar) {
                this.f29650a.c(nVar);
            }
        });
        bVar.b(new zz(this) { // from class: dh.h

            /* renamed from: a  reason: collision with root package name */
            public final e f29651a;

            {
                this.f29651a = this;
            }

            @Override // ai.zz
            public final void a(ImageView.ScaleType scaleType) {
                this.f29651a.b(scaleType);
            }
        });
    }

    public void setNativeAd(@RecentlyNonNull c cVar) {
        if (this.f29649x != null) {
            throw null;
        }
    }

    public final void setPriceView(View view) {
        d("3007", view);
    }

    public final void setStarRatingView(View view) {
        d("3009", view);
    }

    public final void setStoreView(View view) {
        d("3006", view);
    }
}
