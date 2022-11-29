package v9;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import be.x1;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftGachaItem;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffectType;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestEquipmentGachaResultsResponse;
import io.p;
import java.util.ArrayList;
import java.util.List;
import jo.q;
import ud.u0;
import ud.v0;
import wn.v;
import xn.t;

/* loaded from: classes.dex */
public final class d extends androidx.fragment.app.e implements h {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public e N0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a() {
            return new d();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f56982a;

        static {
            int[] iArr = new int[GiftItemEffectType.values().length];
            iArr[GiftItemEffectType.EMOMO_QUEST.ordinal()] = 1;
            f56982a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements p<l0.i, Integer, v> {
        public c() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                k.a(d.this, iVar, 8);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    @Override // v9.h
    public void A(EmomoQuestEquipmentGachaResultsResponse emomoQuestEquipmentGachaResultsResponse, int i10) {
        Parcelable a10;
        jo.p.h(emomoQuestEquipmentGachaResultsResponse, "response");
        x1.a aVar = x1.O0;
        List<GiftGachaItem> results = emomoQuestEquipmentGachaResultsResponse.getResults();
        ArrayList arrayList = new ArrayList(t.u(results, 10));
        for (GiftGachaItem giftGachaItem : results) {
            GiftItemEffect effect = giftGachaItem.getEffect();
            GiftItemEffectType type = effect != null ? effect.getType() : null;
            if ((type == null ? -1 : b.f56982a[type.ordinal()]) == 1) {
                v0.a aVar2 = v0.K;
                Context N2 = N2();
                jo.p.g(N2, "requireContext()");
                a10 = aVar2.a(N2, giftGachaItem, emomoQuestEquipmentGachaResultsResponse.getSpecialEffectSpan());
            } else {
                u0.a aVar3 = u0.I;
                Context N22 = N2();
                jo.p.g(N22, "requireContext()");
                a10 = aVar3.a(N22, giftGachaItem);
            }
            arrayList.add(a10);
        }
        aVar.a(new ArrayList<>(arrayList), i10).z3(p0(), "GiftItemDetailDialogFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setContent(s0.c.c(-1192501127, true, new c()));
        return composeView;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    @Override // v9.h
    public void close() {
        n3();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        jo.p.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        e eVar = this.N0;
        if (eVar != null) {
            eVar.B1();
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), q9.j.f48844a);
        w3(false);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof e ? (e) context : null;
    }
}
