import uuid
from django.db import models

# from micro_services.device.repositories.event_type.models import EventType
# from micro_services.device.repositories.training_program.models import TrainingProgram
# from micro_services.users.repositories.base.models import User
from django.utils import timezone


class Event(models.Model):
    pass
    # id = models.UUIDField(max_length=50, editable=False, primary_key=True, default=uuid.uuid4)
    # user = models.ForeignKey(User, on_delete=models.CASCADE)
    # device = models.CharField(max_length=255)
    # event_type = models.ForeignKey(EventType, on_delete=models.CASCADE)
    # training_program = models.ForeignKey(TrainingProgram, on_delete=models.SET_NULL, null=True)
    # timestamp = models.DateTimeField(default=timezone.now)
