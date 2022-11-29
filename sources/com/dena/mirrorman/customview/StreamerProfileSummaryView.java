package com.dena.mirrorman.customview;

import ae.an;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.f;
import jo.h;
import jo.p;
import nd.b1;

/* loaded from: classes2.dex */
public final class StreamerProfileSummaryView extends FrameLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final a f25610x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f25611y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final an f25612w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final void a(StreamerProfileSummaryView streamerProfileSummaryView, String str) {
            p.h(streamerProfileSummaryView, "<this>");
            AppCompatImageView appCompatImageView = streamerProfileSummaryView.f25612w.B;
            p.g(appCompatImageView, "binding.profileImageView");
            td.a.i(appCompatImageView, str);
        }

        public final void b(StreamerProfileSummaryView streamerProfileSummaryView, String str) {
            p.h(streamerProfileSummaryView, "<this>");
            streamerProfileSummaryView.f25612w.C.setText(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamerProfileSummaryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p.h(context, "context");
    }

    public /* synthetic */ StreamerProfileSummaryView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void b(StreamerProfileSummaryView streamerProfileSummaryView, String str) {
        f25610x.a(streamerProfileSummaryView, str);
    }

    public static final void c(StreamerProfileSummaryView streamerProfileSummaryView, String str) {
        f25610x.b(streamerProfileSummaryView, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamerProfileSummaryView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.h(context, "context");
        this.f25612w = (an) f.e(LayoutInflater.from(getContext()), b1.view_streamer_profile_summary, this, true);
    }
}
