package com.dena.mirrorman.customview;

import ae.ac;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.GroupShotMemberSettingView;
import de.n;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import nd.b1;
import nd.f1;
import nd.w0;
import p001if.c;
import rd.u0;
import ud.f3;
import xn.t;

/* loaded from: classes2.dex */
public final class GroupShotMemberSettingView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final ac f25460w;

    /* renamed from: x  reason: collision with root package name */
    public a f25461x;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b(b bVar);
    }

    /* loaded from: classes2.dex */
    public enum b {
        UnSelected(""),
        Ranking("ranking"),
        Random("random"),
        UserIds("user_ids");
        
        private final String value;

        b(String str) {
            this.value = str;
        }

        public final String c() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupShotMemberSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        ac acVar = (ac) f.e(LayoutInflater.from(getContext()), b1.view_group_shot_member_setting, this, true);
        this.f25460w = acVar;
        acVar.I.setOnClickListener(new View.OnClickListener() { // from class: yd.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupShotMemberSettingView.e(GroupShotMemberSettingView.this, view);
            }
        });
        acVar.H.setOnClickListener(new View.OnClickListener() { // from class: yd.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupShotMemberSettingView.f(GroupShotMemberSettingView.this, view);
            }
        });
        acVar.F.setOnClickListener(new View.OnClickListener() { // from class: yd.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupShotMemberSettingView.g(GroupShotMemberSettingView.this, view);
            }
        });
        acVar.K.setEnabled(false);
        acVar.K.setOnClickListener(new View.OnClickListener() { // from class: yd.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupShotMemberSettingView.h(GroupShotMemberSettingView.this, view);
            }
        });
        acVar.M.setLayoutManager(new LinearLayoutManager(acVar.u().getContext(), 0, false));
        acVar.M.g(new c(n.b(this, 4), n.b(this, 4), 0, n.b(this, 4), 0, 0));
    }

    public static final void e(GroupShotMemberSettingView groupShotMemberSettingView, View view) {
        p.h(groupShotMemberSettingView, "this$0");
        a aVar = groupShotMemberSettingView.f25461x;
        if (aVar != null) {
            aVar.b(b.Ranking);
        }
    }

    public static final void f(GroupShotMemberSettingView groupShotMemberSettingView, View view) {
        p.h(groupShotMemberSettingView, "this$0");
        a aVar = groupShotMemberSettingView.f25461x;
        if (aVar != null) {
            aVar.b(b.Random);
        }
    }

    public static final void g(GroupShotMemberSettingView groupShotMemberSettingView, View view) {
        p.h(groupShotMemberSettingView, "this$0");
        a aVar = groupShotMemberSettingView.f25461x;
        if (aVar != null) {
            aVar.b(b.UserIds);
        }
    }

    public static final void h(GroupShotMemberSettingView groupShotMemberSettingView, View view) {
        p.h(groupShotMemberSettingView, "this$0");
        a aVar = groupShotMemberSettingView.f25461x;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final a getListener() {
        return this.f25461x;
    }

    @SuppressLint({"ResourceAsColor"})
    public final void i(b bVar, int i10, List<String> list) {
        p.h(bVar, "memberType");
        boolean z10 = true;
        if (bVar == b.Ranking && i10 > 0) {
            this.f25460w.I.setTitleColor(w0.U0);
            this.f25460w.I.setBorderWidth(0);
            this.f25460w.I.setRoundedButtonViewBackgroundColor(w0.f42242u0);
            if (i10 > 0) {
                this.f25460w.I.setTitle(getResources().getString(f1.text_groupshot_setup_step1_ranking) + " / " + getResources().getString(f1.f41965a3, String.valueOf(i10)));
            }
        } else {
            RoundedButtonView roundedButtonView = this.f25460w.I;
            int i11 = w0.Y;
            roundedButtonView.setTitleColor(i11);
            this.f25460w.I.setBorderWidth(n.b(this, 1));
            this.f25460w.I.setBorderColor(i11);
            this.f25460w.I.setRoundedButtonViewBackgroundColor(w0.U0);
            this.f25460w.I.setTitle(getResources().getString(f1.text_groupshot_setup_step1_ranking));
        }
        if (bVar == b.Random && i10 > 0) {
            this.f25460w.H.setTitleColor(w0.U0);
            this.f25460w.H.setBorderWidth(0);
            this.f25460w.H.setRoundedButtonViewBackgroundColor(w0.f42242u0);
            if (i10 > 0) {
                this.f25460w.H.setTitle(getResources().getString(f1.text_random) + " / " + getResources().getString(f1.f41965a3, String.valueOf(i10)));
            }
        } else {
            RoundedButtonView roundedButtonView2 = this.f25460w.H;
            int i12 = w0.Y;
            roundedButtonView2.setTitleColor(i12);
            this.f25460w.H.setBorderWidth(n.b(this, 1));
            this.f25460w.H.setBorderColor(i12);
            this.f25460w.H.setRoundedButtonViewBackgroundColor(w0.U0);
            this.f25460w.H.setTitle(getResources().getString(f1.text_random));
        }
        if (bVar == b.UserIds && i10 > 0) {
            this.f25460w.L.setTextColor(c3.a.d(getContext(), w0.U0));
            this.f25460w.F.setBorderWidth(0);
            this.f25460w.F.setRoundedButtonViewBackgroundColor(w0.f42242u0);
        } else {
            AppCompatTextView appCompatTextView = this.f25460w.L;
            Context context = getContext();
            int i13 = w0.Y;
            appCompatTextView.setTextColor(c3.a.d(context, i13));
            this.f25460w.F.setBorderWidth(n.b(this, 1));
            this.f25460w.F.setBorderColor(i13);
            this.f25460w.F.setRoundedButtonViewBackgroundColor(w0.U0);
        }
        if (!(list == null || list.isEmpty())) {
            this.f25460w.M.setVisibility(0);
            RecyclerView recyclerView = this.f25460w.M;
            u0 u0Var = new u0();
            ArrayList arrayList = new ArrayList(t.u(list, 10));
            for (String str : list) {
                arrayList.add(new f3(str, null));
            }
            u0Var.c(arrayList);
            this.f25460w.L.setText(getResources().getString(f1.text_groupshot_select_by_myself) + " / ");
            recyclerView.setAdapter(u0Var);
        } else {
            this.f25460w.M.setVisibility(8);
            this.f25460w.L.setText(getResources().getString(f1.text_groupshot_select_by_myself));
        }
        this.f25460w.K.setEnabled((bVar == b.UnSelected || i10 <= 0) ? false : false);
    }

    public final void setListener(a aVar) {
        this.f25461x = aVar;
    }
}
