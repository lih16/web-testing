from locust import HttpLocust, TaskSet, task
#for locust
# to get list of hosts ps -fA | grep python
#  KILL -9 to kill it

class UserBehavior(TaskSet):
    def on_start(self):
        """ on_start is called when a Locust start before any task is scheduled """
        self.login()

    def login(self):
        self.client.post("/login", {"username":"osman.siddiqui@sema4genomics.com", "password":"12345678"})

    @task(2)
    def index(self):
        self.client.get("/")

    @task(1)
    def profile(self):
        self.client.get("/profile")

class WebsiteUser(HttpLocust):
    task_set = UserBehavior
    min_wait = 5000
    max_wait = 9000
