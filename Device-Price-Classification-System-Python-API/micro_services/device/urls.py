from django.urls import path, include

urlpatterns = [
    path('', include('micro_services.device.repositories.urls')),
]