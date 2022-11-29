package com.dena.mirrativ.streaming.groupshot;

import ac.j5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.streaming.groupshot.GroupShotBackgroundSettingView;
import de.n;
import hc.f;
import hc.l;
import java.util.List;
import jo.h;
import jo.p;
import ud.h1;

/* loaded from: classes2.dex */
public final class GroupShotBackgroundSettingView extends FrameLayout {

    /* renamed from: y  reason: collision with root package name */
    public static final a f23719y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f23720z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final j5 f23721w;

    /* renamed from: x  reason: collision with root package name */
    public b f23722x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends f.a {
        void c();

        void d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupShotBackgroundSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        j5 j5Var = (j5) androidx.databinding.f.e(LayoutInflater.from(getContext()), xb.p.view_group_shot_background_setting, this, true);
        this.f23721w = j5Var;
        j5Var.F.setLayoutManager(new GridLayoutManager(getContext(), 3));
        j5Var.F.g(new l(n.b(this, 8)));
        j5Var.F.setAdapter(new f());
        j5Var.B.setOnClickListener(new View.OnClickListener() { // from class: hc.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupShotBackgroundSettingView.c(GroupShotBackgroundSettingView.this, view);
            }
        });
        j5Var.G.setOnClickListener(new View.OnClickListener() { // from class: hc.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupShotBackgroundSettingView.d(GroupShotBackgroundSettingView.this, view);
            }
        });
    }

    public static final void c(GroupShotBackgroundSettingView groupShotBackgroundSettingView, View view) {
        p.h(groupShotBackgroundSettingView, "this$0");
        b bVar = groupShotBackgroundSettingView.f23722x;
        if (bVar != null) {
            bVar.c();
        }
    }

    public static final void d(GroupShotBackgroundSettingView groupShotBackgroundSettingView, View view) {
        p.h(groupShotBackgroundSettingView, "this$0");
        b bVar = groupShotBackgroundSettingView.f23722x;
        if (bVar != null) {
            bVar.d();
        }
    }

    public final void setBindModels(List<? extends h1> list) {
        p.h(list, "bindModels");
        RecyclerView.h adapter = this.f23721w.F.getAdapter();
        p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.groupshot.GroupShotBackgroundSettingAdapter");
        ((f) adapter).h(list);
    }

    public final void setEnabledSnapButton(boolean z10) {
        this.f23721w.G.setEnabled(z10);
    }

    public final void setListener(b bVar) {
        p.h(bVar, "listener");
        this.f23722x = bVar;
        RecyclerView.h adapter = this.f23721w.F.getAdapter();
        p.f(adapter, "null cannot be cast to non-null type com.dena.mirrativ.streaming.groupshot.GroupShotBackgroundSettingAdapter");
        ((f) adapter).i(bVar);
    }
}
