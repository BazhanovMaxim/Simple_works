def new_decorator(func):

    def wrap_func():
        print("some code before")

        func()

        print("Some code after")

    return wrap_func

@new_decorator # func_need_decorator = new_decorator(func_need_decorator)
def func_need_decorator():
    print("Please decorate me!")


func_need_decorator()
