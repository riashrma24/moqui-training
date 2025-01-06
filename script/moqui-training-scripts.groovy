import org.moqui.context.ExecutionContext
import org.moqui.entity.EntityValue

ExecutionContext ec=context.ec

def training=ec.entity.makeValue("moqui.training.MoquiTraining")
training.setField(context,true,null,null)
if(!training.trainingId)training.setSequencedIdPrimaryKey()
training.create()