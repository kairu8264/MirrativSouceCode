package k0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.z;
import c1.c0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import l0.c2;

/* loaded from: classes.dex */
public final class d extends e {
    public d(boolean z10, float f10, c2<c0> c2Var) {
        super(z10, f10, c2Var, null);
    }

    public /* synthetic */ d(boolean z10, float f10, c2 c2Var, jo.h hVar) {
        this(z10, f10, c2Var);
    }

    @Override // k0.e
    public m b(x.k kVar, boolean z10, float f10, c2<c0> c2Var, c2<f> c2Var2, l0.i iVar, int i10) {
        jo.p.h(kVar, "interactionSource");
        jo.p.h(c2Var, TtmlNode.ATTR_TTS_COLOR);
        jo.p.h(c2Var2, "rippleAlpha");
        iVar.x(331259447);
        ViewGroup c10 = c(iVar, (i10 >> 15) & 14);
        iVar.x(1643267286);
        if (c10.isInEditMode()) {
            iVar.x(-3686552);
            boolean P = iVar.P(kVar) | iVar.P(this);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new b(z10, f10, c2Var, c2Var2, null);
                iVar.q(y10);
            }
            iVar.O();
            b bVar = (b) y10;
            iVar.O();
            iVar.O();
            return bVar;
        }
        iVar.O();
        i iVar2 = null;
        int i11 = 0;
        int childCount = c10.getChildCount();
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = c10.getChildAt(i11);
            if (childAt instanceof i) {
                iVar2 = childAt;
                break;
            }
            i11++;
        }
        if (iVar2 == null) {
            Context context = c10.getContext();
            jo.p.g(context, "view.context");
            iVar2 = new i(context);
            c10.addView(iVar2);
        }
        iVar.x(-3686095);
        boolean P2 = iVar.P(kVar) | iVar.P(this) | iVar.P(iVar2);
        Object y11 = iVar.y();
        if (P2 || y11 == l0.i.f39065a.a()) {
            y11 = new a(z10, f10, c2Var, c2Var2, iVar2, null);
            iVar.q(y11);
        }
        iVar.O();
        a aVar = (a) y11;
        iVar.O();
        return aVar;
    }

    public final ViewGroup c(l0.i iVar, int i10) {
        iVar.x(-1737891121);
        Object G = iVar.G(z.k());
        while (!(G instanceof ViewGroup)) {
            ViewParent parent = ((View) G).getParent();
            if (parent instanceof View) {
                jo.p.g(parent, "parent");
                G = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + G + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) G;
        iVar.O();
        return viewGroup;
    }
}
