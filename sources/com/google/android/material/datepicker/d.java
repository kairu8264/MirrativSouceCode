package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* loaded from: classes3.dex */
public interface d<S> extends Parcelable {
    Collection<Long> D1();

    S H1();

    void N1(long j10);

    String T0(Context context);

    Collection<n3.d<Long, Long>> W0();

    int l0(Context context);

    View o1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, o<S> oVar);

    boolean z1();
}
