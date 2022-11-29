package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;

/* loaded from: classes3.dex */
public final class TrackSelectionUtil {

    /* loaded from: classes3.dex */
    public interface AdaptiveTrackSelectionFactory {
        ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    public static ExoTrackSelection[] createTrackSelectionsForDefinitions(ExoTrackSelection.Definition[] definitionArr, AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        boolean z10 = false;
        for (int i10 = 0; i10 < definitionArr.length; i10++) {
            ExoTrackSelection.Definition definition = definitionArr[i10];
            if (definition != null) {
                int[] iArr = definition.tracks;
                if (iArr.length > 1 && !z10) {
                    exoTrackSelectionArr[i10] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z10 = true;
                } else {
                    exoTrackSelectionArr[i10] = new FixedTrackSelection(definition.group, iArr[0], definition.reason, definition.data);
                }
            }
        }
        return exoTrackSelectionArr;
    }

    public static DefaultTrackSelector.Parameters updateParametersWithOverride(DefaultTrackSelector.Parameters parameters, int i10, TrackGroupArray trackGroupArray, boolean z10, DefaultTrackSelector.SelectionOverride selectionOverride) {
        DefaultTrackSelector.ParametersBuilder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i10).setRendererDisabled(i10, z10);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i10, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }
}
