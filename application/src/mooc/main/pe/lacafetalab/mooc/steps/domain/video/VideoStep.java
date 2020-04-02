package pe.lacafetalab.mooc.steps.domain.video;

import pe.lacafetalab.mooc.steps.domain.Step;
import pe.lacafetalab.mooc.steps.domain.StepId;
import pe.lacafetalab.mooc.steps.domain.StepTitle;
import pe.lacafetalab.shared.domain.VideoUrl;

public final class VideoStep extends Step {
    private final VideoUrl      videoUrl;
    private final VideoStepText text;

    public VideoStep(StepId id, StepTitle title, VideoUrl videoUrl, VideoStepText text) {
        super(id, title);

        this.videoUrl = videoUrl;
        this.text     = text;
    }

    private VideoStep() {
        super(null, null);

        this.videoUrl = null;
        this.text     = null;
    }
}
