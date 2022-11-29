package com.dena.mirrorman.net.fme;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import jf.a0;
import jf.b;
import jf.q0;
import jf.r0;
import jf.z;
import jo.p;
import wn.v;
import xn.r;

/* loaded from: classes2.dex */
public final class KaraokeConverter {
    public static final int $stable = 0;
    public static final KaraokeConverter INSTANCE = new KaraokeConverter();

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventType.values().length];
            iArr[EventType.START_CHANGE_COLOR.ordinal()] = 1;
            iArr[EventType.CHANGE_COLOR_SPEED.ordinal()] = 2;
            iArr[EventType.CHANGE_COLOR_LOW_SPEED.ordinal()] = 3;
            iArr[EventType.CLAPPING_PLAY.ordinal()] = 4;
            iArr[EventType.SHOW_NEXT_SCREEN.ordinal()] = 5;
            iArr[EventType.REMOVE_BLOCK.ordinal()] = 6;
            iArr[EventType.SHOW_BLOCK.ordinal()] = 7;
            iArr[EventType.SUB_BLOCK_CHANGE_COLOR.ordinal()] = 8;
            iArr[EventType.SUB_BLOCK_START_CHANGE_COLOR.ordinal()] = 9;
            iArr[EventType.START_CHORUS.ordinal()] = 10;
            iArr[EventType.CUT_LATE_PLAYING.ordinal()] = 11;
            iArr[EventType.END_TWO_CHORUS.ordinal()] = 12;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private KaraokeConverter() {
    }

    private final List<a0> checkAndMargeLyricsData(List<a0> list) {
        v vVar;
        for (a0 a0Var : list) {
            for (r0 r0Var : a0Var.j()) {
                if (r0Var.b() < 0) {
                    r0Var.e(0);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        a0 a0Var2 = null;
        for (a0 a0Var3 : list) {
            if (a0Var2 != null) {
                if (a0Var3.f() == a0Var2.f()) {
                    a0Var2 = INSTANCE.mergeLyricsData(a0Var2, a0Var3);
                } else {
                    arrayList.add(a0Var2);
                    a0Var2 = a0Var3;
                }
                vVar = v.f59242a;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                a0Var2 = a0Var3;
            }
        }
        if (a0Var2 != null) {
            arrayList.add(a0Var2);
        }
        return arrayList;
    }

    private final List<z> getCharaInfoList(FmeData fmeData) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (FmeLyricsData fmeLyricsData : fmeData.getLyrics().getLyricsDataList()) {
            for (CharaData charaData : fmeLyricsData.getCharaDataList()) {
                arrayList2.add(new b(fmeLyricsData.getPositionX(), fmeLyricsData.getPositionY(), fmeLyricsData.getChangeColorFlag(), charaData.getChara(), charaData.getCharaWidth()));
            }
            for (RubyData rubyData : fmeLyricsData.getRubyDataList()) {
                arrayList3.add(new q0(rubyData.getPositionX(), rubyData.getChara(), rubyData.getLength(), 0, 8, null));
            }
            arrayList.add(new z(arrayList2, arrayList3));
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
        }
        return arrayList;
    }

    private final List<List<r0>> getSpeedInfoList(FmeData fmeData) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        for (FmeEventTiming fmeEventTiming : fmeData.getEventTimings()) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[fmeEventTiming.getEventType().ordinal()];
            if (i12 == 1) {
                if (i10 != 0) {
                    arrayList2.add(new r0(i10, i11, fmeEventTiming.getEventMillis()));
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(arrayList2);
                    arrayList2 = new ArrayList();
                }
                i10 = fmeEventTiming.getEventData()[0] * 10;
                i11 = fmeEventTiming.getEventMillis();
            } else if (i12 == 2) {
                if (i10 != 0) {
                    arrayList2.add(new r0(i10, i11, fmeEventTiming.getEventMillis()));
                }
                i10 = fmeEventTiming.getEventData()[0] * 10;
                i11 = fmeEventTiming.getEventMillis();
            } else if (i12 == 3) {
                if (i10 != 0) {
                    arrayList2.add(new r0(i10, i11, fmeEventTiming.getEventMillis()));
                }
                i10 = fmeEventTiming.getEventData()[0];
                i11 = fmeEventTiming.getEventMillis();
            } else if (i12 == 4 && i10 != 0) {
                arrayList2.add(new r0(i10, i11, fmeEventTiming.getEventMillis()));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private final a0 mergeLyricsData(a0 a0Var, a0 a0Var2) {
        int i10;
        int d10;
        int i11 = 0;
        for (b bVar : a0Var.b()) {
            i11 += bVar.e();
        }
        int i12 = 0;
        loop1: while (true) {
            int i13 = i12;
            for (r0 r0Var : a0Var.j()) {
                i12 += (r0Var.b() * (r0Var.a() - r0Var.c())) / 1000;
                if (i12 >= i11) {
                    List D0 = xn.a0.D0(a0Var.j());
                    int b10 = (int) ((((i11 - i13) * 1000.0f) / r0Var.b()) + r0Var.c());
                    D0.add(new r0(0, b10, r0Var.a()));
                    r0Var.d(b10);
                    a0Var.m(xn.a0.B0(D0));
                }
            }
        }
        if (a0Var.i() <= a0Var2.i()) {
            i10 = a0Var.i();
        } else {
            i10 = a0Var2.i();
        }
        int i14 = i10;
        if (a0Var.d() >= a0Var2.d()) {
            d10 = a0Var.d();
        } else {
            d10 = a0Var2.d();
        }
        int i15 = d10;
        int f10 = a0Var.f();
        ChangeColorFlag a10 = a0Var.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a0Var.b());
        arrayList.addAll(a0Var2.b());
        v vVar = v.f59242a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(a0Var.h());
        int k10 = a0Var.k();
        for (q0 q0Var : a0Var2.h()) {
            arrayList2.add(new q0(q0Var.d() + k10, q0Var.a(), q0Var.b(), a0Var.e() + 1));
        }
        v vVar2 = v.f59242a;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(a0Var.j());
        arrayList3.add(new r0(0, ((r0) xn.a0.i0(a0Var.j())).a(), ((r0) xn.a0.X(a0Var2.j())).c()));
        arrayList3.addAll(a0Var2.j());
        return new a0(i14, i15, f10, a10, arrayList, arrayList2, arrayList3, a0Var.e() + 1);
    }

    public final jf.v getKaraokeModel(FmeData fmeData) {
        p.h(fmeData, "fmeData");
        ArrayList arrayList = new ArrayList();
        KaraokeConverter karaokeConverter = INSTANCE;
        ListIterator<List<r0>> listIterator = karaokeConverter.getSpeedInfoList(fmeData).listIterator();
        List<z> charaInfoList = karaokeConverter.getCharaInfoList(fmeData);
        List<r0> next = listIterator.next();
        for (z zVar : charaInfoList) {
            if (((b) xn.a0.X(zVar.a())).a() != ChangeColorFlag.NOT_CHANGE) {
                if (listIterator.hasNext()) {
                    List<r0> list = next;
                    arrayList.add(new a0(((r0) xn.a0.X(list)).c(), ((r0) xn.a0.i0(list)).a(), ((b) xn.a0.X(zVar.a())).d(), ((b) xn.a0.X(zVar.a())).a(), zVar.a(), zVar.b(), list, 0, 128, null));
                    next = listIterator.next();
                } else {
                    List<r0> list2 = next;
                    arrayList.add(new a0(((r0) xn.a0.X(list2)).c(), ((r0) xn.a0.i0(list2)).a(), ((b) xn.a0.X(zVar.a())).d(), ((b) xn.a0.X(zVar.a())).a(), zVar.a(), zVar.b(), list2, 0, 128, null));
                }
            } else {
                List<r0> list3 = next;
                arrayList.add(new a0(((r0) xn.a0.X(list3)).c(), ((r0) xn.a0.i0(list3)).a(), ((b) xn.a0.X(zVar.a())).d(), ((b) xn.a0.X(zVar.a())).a(), zVar.a(), zVar.b(), r.d(new r0(0, 0, 0)), 0, 128, null));
            }
        }
        return new jf.v(fmeData.getInfo().getSongTitle(), fmeData.getInfo().getArtists(), fmeData.getInfo().getSongTotalTime(), checkAndMargeLyricsData(arrayList));
    }
}
