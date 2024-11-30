package subscription.workflows;

import io.temporal.workflow.QueryMethod;
import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;
import subscription.model.EmailDetails;
import subscription.model.WorkflowData;

@WorkflowInterface
public interface SendEmailWorkflow {
    @WorkflowMethod
    public void run(WorkflowData data);

    @QueryMethod
    public EmailDetails details();
}
