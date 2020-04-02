package pe.lacafetalab.mooc.steps.domain.video;

import pe.lacafetalab.mooc.steps.domain.StepId;
import pe.lacafetalab.mooc.steps.domain.StepIdMother;
import pe.lacafetalab.mooc.steps.domain.StepTitle;
import pe.lacafetalab.mooc.steps.domain.StepTitleMother;
import pe.lacafetalab.shared.domain.VideoUrl;
import pe.lacafetalab.shared.domain.VideoUrlMother;

public final class VideoStepMother {
    public static VideoStep create(StepId id, StepTitle title, VideoUrl videoUrl, VideoStepText text) {
        return new VideoStep(id, title, videoUrl, text);
    }

    public static VideoStep random() {
        return create(
            StepIdMother.random(),
            StepTitleMother.random(),
            VideoUrlMother.random(),
            VideoStepTextMother.random()
        );
    }
}
